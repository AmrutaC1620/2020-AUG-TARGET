package com.target.training.exceptions;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException() {
    }

    public InvalidSalaryException(String message) {
        super(message);
    }

    public InvalidSalaryException(Throwable cause) {
        super(cause);
    }
}
