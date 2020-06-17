package com.ibiz.api.exception;

import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.SYSTEM_FAILURE);

        return new ResponseEntity<>(errorResponse, ErrorCode.SYSTEM_FAILURE.getStatus());
    }

    @ExceptionHandler(value = InvalidMessageStructureException.class)
    public ResponseEntity<ErrorResponse> handleInvalidMessageStructureException(InvalidMessageStructureException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getErrorCode());

        return new ResponseEntity<>(errorResponse, e.getErrorCode().getStatus());
    }

    @ExceptionHandler(value = ExpiredJwtException.class)
    public ResponseEntity<ErrorResponse> handleExpiredJwtException(ExpiredJwtException e) {
        ErrorResponse errorResponse = new ErrorResponse(ErrorCode.ACCESS_TOKEN_EXPIRED);

        return new ResponseEntity<>(errorResponse, ErrorCode.ACCESS_TOKEN_EXPIRED.getStatus());
    }

    @ExceptionHandler(value = UnauthorizedCilentException.class)
    public ResponseEntity<ErrorResponse> handleUnauthorizedCilentException(UnauthorizedCilentException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getErrorCode());

        return new ResponseEntity<>(errorResponse, e.getErrorCode().getStatus());
    }

}


