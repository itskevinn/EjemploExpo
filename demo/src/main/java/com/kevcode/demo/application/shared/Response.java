package com.kevcode.demo.application.shared;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response<T> {
    private HttpStatus httpStatus;
    private String message;
    private String exceptionMessage;
    private T body;

    public Response(T body, HttpStatus status, String message) {
        this.body = body;
        this.message = message;
        this.httpStatus = status;
    }

    public Response(T body, HttpStatus status, String message, String exceptionMessage) {
        this.body = body;
        this.message = message;
        this.httpStatus = status;
        this.exceptionMessage = exceptionMessage;
    }

}
