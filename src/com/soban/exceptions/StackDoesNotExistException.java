package com.soban.exceptions;

public class StackDoesNotExistException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public StackDoesNotExistException(String errorMessage) {
        super(errorMessage);
    }

}

