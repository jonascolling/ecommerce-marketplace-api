package com.ecommerce.marketplaceapi.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionResponse {

    private String timestamp = LocalDateTime.now().toString();

    private String message;

    private String detail;

    private List<ExceptionDetailResponse> details;

    public ExceptionResponse() {}

    public ExceptionResponse(String message, String detail) {
        this.message = message;
        this.detail = detail;
    }

    public ExceptionResponse(String message, List<ExceptionDetailResponse> details) {
        this.message = message;
        this.details = details;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<ExceptionDetailResponse> getDetails() {
        return details;
    }

    public void setDetails(List<ExceptionDetailResponse> details) {
        this.details = details;
    }
}
