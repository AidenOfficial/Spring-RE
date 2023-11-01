package com.aiden.config;

import io.sentry.Sentry;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public void handleException(Exception ex) {
        Sentry.captureException(ex);
    }
}
