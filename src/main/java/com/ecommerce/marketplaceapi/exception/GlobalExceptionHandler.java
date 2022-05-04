package com.ecommerce.marketplaceapi.exception;

import com.ecommerce.marketplaceapi.constants.RequestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RequestMapping(produces = "application/json")
public class GlobalExceptionHandler {

    @Autowired
    private RequestHelper requestHelper;

    @ExceptionHandler
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception exception, WebRequest request) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ExceptionResponse(exception.getLocalizedMessage(), requestHelper.getUriOrigin(request)));
    }

}
