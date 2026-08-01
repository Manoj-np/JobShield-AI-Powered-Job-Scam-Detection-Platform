package com.jobshield.ai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiTestController {

    private final GeminiService geminiService;

    public AiTestController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }	

    @GetMapping("/api/ai/test")
    public String testAI() {

        return geminiService.analyzeJob(
                "Pay ₹500 registration fee before interview. Contact only on WhatsApp."
        );
    }
}