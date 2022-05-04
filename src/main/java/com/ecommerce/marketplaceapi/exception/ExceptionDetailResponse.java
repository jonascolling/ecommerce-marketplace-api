package com.ecommerce.marketplaceapi.exception;

import org.springframework.validation.FieldError;

public class ExceptionDetailResponse {

    private String target;

    private String message;

    private Object rejectValue;

    public ExceptionDetailResponse(){}

    public ExceptionDetailResponse(FieldError fe) {
        this.target = fe.getField();
        this.message = fe.getDefaultMessage();
        this.rejectValue = fe.getRejectedValue();
    }


}
