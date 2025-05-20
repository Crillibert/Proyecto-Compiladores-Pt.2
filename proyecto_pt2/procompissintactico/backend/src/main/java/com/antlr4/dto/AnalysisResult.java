package com.antlr4.dto;

public class AnalysisResult {
    private String parseTree;
    private String errors;
    private boolean success;

    // Constructor
    public AnalysisResult() {}

    // Getters y Setters
    public String getParseTree() {
        return parseTree;
    }

    public void setParseTree(String parseTree) {
        this.parseTree = parseTree;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}