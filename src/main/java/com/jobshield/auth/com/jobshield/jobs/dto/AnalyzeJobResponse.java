package com.jobshield.jobs.dto;

public class AnalyzeJobResponse {

    private Integer riskScore;
    private String riskLevel;
    private String reason;

    public AnalyzeJobResponse() {
    }

    public AnalyzeJobResponse(Integer riskScore,
                              String riskLevel,
                              String reason) {
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
        this.reason = reason;
    }

    public Integer getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}