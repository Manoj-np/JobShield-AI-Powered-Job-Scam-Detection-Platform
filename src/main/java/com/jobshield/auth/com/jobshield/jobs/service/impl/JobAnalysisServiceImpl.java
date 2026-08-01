package com.jobshield.jobs.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.jobshield.auth.entity.User;
import com.jobshield.auth.repository.UserRepository;
import com.jobshield.exception.ResourceNotFoundException;
import com.jobshield.jobs.dto.AnalyzeJobRequest;
import com.jobshield.jobs.dto.AnalyzeJobResponse;
import com.jobshield.jobs.dto.DashboardResponse;
import com.jobshield.jobs.dto.JobDetailsResponse;
import com.jobshield.jobs.dto.JobHistoryResponse;
import com.jobshield.jobs.entity.JobAnalysis;
import com.jobshield.jobs.repository.JobAnalysisRepository;
import com.jobshield.jobs.service.JobAnalysisService;

@Service
public class JobAnalysisServiceImpl implements JobAnalysisService {

    private final UserRepository userRepository;
    private final JobAnalysisRepository jobAnalysisRepository;

    public JobAnalysisServiceImpl(
            JobAnalysisRepository jobAnalysisRepository,
            UserRepository userRepository) {

        this.jobAnalysisRepository = jobAnalysisRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<JobHistoryResponse> getHistory() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));

        List<JobAnalysis> analyses =
                jobAnalysisRepository.findByUser(user);

        return analyses.stream()
                .map(job -> new JobHistoryResponse(
                        job.getAnalysisId(),
                        job.getCompanyName(),
                        job.getJobTitle(),
                        job.getRiskScore(),
                        job.getRiskLevel(),
                        job.getCreatedAt()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public JobDetailsResponse getAnalysisById(Long analysisId) {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));

        JobAnalysis analysis = jobAnalysisRepository
                .findByAnalysisIdAndUser(analysisId, user)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Analysis not found"));

        return new JobDetailsResponse(
                analysis.getAnalysisId(),
                analysis.getCompanyName(),
                analysis.getJobTitle(),
                analysis.getSalary(),
                analysis.getJobDescription(),
                analysis.getRiskScore(),
                analysis.getRiskLevel(),
                analysis.getAiReason(),
                analysis.getCreatedAt()
        );
    }
    @Override
    public DashboardResponse getDashboard() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));

        long total = jobAnalysisRepository.countByUser(user);

        long high = jobAnalysisRepository
                .countByUserAndRiskLevel(user, "HIGH");

        long medium = jobAnalysisRepository
                .countByUserAndRiskLevel(user, "MEDIUM");

        long low = jobAnalysisRepository
                .countByUserAndRiskLevel(user, "LOW");

        return new DashboardResponse(
                total,
                high,
                medium,
                low
        );
    }

    @Override
    public AnalyzeJobResponse analyzeJob(AnalyzeJobRequest request) {

        String description = request.getJobDescription().toLowerCase();

        int riskScore = 10;
        String riskLevel = "LOW";
        String reason = "Job looks safe.";

        if (description.contains("registration fee")
                || description.contains("pay")
                || description.contains("processing fee")) {

            riskScore = 95;
            riskLevel = "HIGH";
            reason = "Registration or processing fee detected.";

        } else if (description.contains("whatsapp")
                || description.contains("telegram")) {

            riskScore = 70;
            riskLevel = "MEDIUM";
            reason = "Unofficial communication channel detected.";
        }

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));

        JobAnalysis analysis = new JobAnalysis();

        analysis.setCompanyName(request.getCompanyName());
        analysis.setJobTitle(request.getJobTitle());
        analysis.setSalary(request.getSalary());
        analysis.setJobDescription(request.getJobDescription());
        analysis.setRiskScore(riskScore);
        analysis.setRiskLevel(riskLevel);
        analysis.setAiReason(reason);
        analysis.setCreatedAt(LocalDateTime.now());
        analysis.setUser(user);

        jobAnalysisRepository.save(analysis);

        return new AnalyzeJobResponse(
                riskScore,
                riskLevel,
                reason
        );
    }
}