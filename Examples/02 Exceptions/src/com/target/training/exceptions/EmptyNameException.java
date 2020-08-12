package com.target.training.exceptions;

public class EmptyNameException extends Exception {
    public EmptyNameException() {
    }

    public EmptyNameException(String message) {
        super(message);
    }

    public EmptyNameException(Throwable cause) {
        super(cause);
    }
}
