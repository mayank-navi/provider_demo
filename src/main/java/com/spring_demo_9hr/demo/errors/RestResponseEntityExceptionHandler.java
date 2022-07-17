package com.spring_demo_9hr.demo.errors;

import com.spring_demo_9hr.demo.entitiy.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProviderNotFoundExceptions.class)
    public ResponseEntity<ErrorMessage> ProviderNotFoundExpceptions(ProviderNotFoundExceptions exception){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

    @ExceptionHandler(ProviderDataNotEnoughExceptions.class)
    public ResponseEntity<ErrorMessage> ProviderDataNotEnoughExceptions(ProviderDataNotEnoughExceptions exceptions){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_ACCEPTABLE, exceptions.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(message);
    }
}
