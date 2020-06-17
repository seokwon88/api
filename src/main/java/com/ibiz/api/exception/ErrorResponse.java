package com.ibiz.api.exception;

public class ErrorResponse {

    private String message;
    private String code;
    private String application;

    ErrorResponse(ErrorCode errorCode) {
        this.message = errorCode.getMessage();
        this.code = errorCode.getCode();
        this.application = "ibiz-sales-report";
    }

    public String getMessage() {
        return message;
    }

    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ErrorResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getApplication() {
        return application;
    }

    public ErrorResponse setApplication(String application) {
        this.application = application;
        return this;
    }
}
