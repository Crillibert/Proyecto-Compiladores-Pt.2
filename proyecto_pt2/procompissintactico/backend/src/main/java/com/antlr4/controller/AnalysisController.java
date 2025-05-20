package com.antlr4.controller;

import com.antlr4.service.AnalysisService;
import com.antlr4.dto.AnalysisRequest;
import com.antlr4.dto.AnalysisResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analyze")
@CrossOrigin(origins = "http://localhost:3000") // Permite conexión desde React
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    @PostMapping
    public AnalysisResult analyzeCode(@RequestBody AnalysisRequest request) {
        return analysisService.analyze(request.getCode());
    }
}