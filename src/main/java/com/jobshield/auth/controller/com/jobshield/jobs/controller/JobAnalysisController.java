package com.jobshield.jobs.controller;

import java.util.List;
import com.jobshield.jobs.dto.JobDetailsResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.jobshield.jobs.dto.AnalyzeJobRequest;
import com.jobshield.jobs.dto.AnalyzeJobResponse;
import com.jobshield.jobs.dto.DashboardResponse;
import com.jobshield.jobs.dto.JobHistoryResponse;
import com.jobshield.jobs.service.JobAnalysisService;

@RestController
@RequestMapping("/api/jobs")
public class JobAnalysisController {
    private final JobAnalysisService jobAnalysisService;

    public JobAnalysisController(JobAnalysisService jobAnalysisService) {
        this.jobAnalysisService = jobAnalysisService;
    }

    @PostMapping("/analyze")
    public ResponseEntity<AnalyzeJobResponse> analyzeJob(
            @Valid @RequestBody AnalyzeJobRequest request) {

        AnalyzeJobResponse response =
                jobAnalysisService.analyzeJob(request);

        return ResponseEntity.ok(response);
        
    }
    @GetMapping("/history")
    public ResponseEntity<List<JobHistoryResponse>> getHistory() {

        List<JobHistoryResponse> history =
                jobAnalysisService.getHistory();

        return ResponseEntity.ok(history);
    }
    @GetMapping("/{analysisId}")
    public ResponseEntity<JobDetailsResponse> getAnalysisById(
            @PathVariable Long analysisId) {

        JobDetailsResponse response =
                jobAnalysisService.getAnalysisById(analysisId);

        return ResponseEntity.ok(response);
    }
    @GetMapping("/dashboard")
    public ResponseEntity<DashboardResponse> getDashboard() {

        DashboardResponse response =
                jobAnalysisService.getDashboard();

        return ResponseEntity.ok(response);
    }
}