package com.jobshield.jobs.service;
import java.util.List;
import com.jobshield.jobs.dto.JobHistoryResponse;
import com.jobshield.jobs.dto.AnalyzeJobRequest;
import com.jobshield.jobs.dto.AnalyzeJobResponse;
import com.jobshield.jobs.dto.JobDetailsResponse;
import com.jobshield.jobs.dto.DashboardResponse;

public interface JobAnalysisService {

    AnalyzeJobResponse analyzeJob(AnalyzeJobRequest request);
    List<JobHistoryResponse> getHistory();
    DashboardResponse getDashboard();

    JobDetailsResponse getAnalysisById(Long analysisId);
    

}