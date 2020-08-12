package com.target.training.exceptions;

// by extending java.lang.Exception this class becomes a checked-exception
// which means user of a function that throws this exception must handle the same
// by either using a try-catch block, or further throwing away
public class InvalidIdException extends Exception {
    public InvalidIdException() {
    }

    public InvalidIdException(String message) {
        super(message);
    }

    public InvalidIdException(Throwable cause) {
        super(cause);
    }
}
