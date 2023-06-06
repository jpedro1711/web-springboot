package com.joaopedroigeskimorais.course.resources.exceptions;

import com.joaopedroigeskimorais.course.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String err = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandartError error = new StandartError(Instant.now(), status.value(), err, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }
}
