package com.springapp.mvc.exception;

public class NotValidException extends Exception {

    public NotValidException() {
        super();
    }

    public NotValidException(String message) {
        super(message);
    }

    public NotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidException(Throwable cause) {
        super(cause);
    }

    protected NotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}