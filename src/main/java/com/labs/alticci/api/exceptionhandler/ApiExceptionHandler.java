package com.labs.alticci.api.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<ExceptionDTO> exception(final IllegalArgumentException exception) {
        ExceptionDTO dto = ExceptionDTO.builder().code(HttpStatus.BAD_REQUEST.value()).message(exception.getMessage()).build();
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }
}
