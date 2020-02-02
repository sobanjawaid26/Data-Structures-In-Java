package com.soban.exceptions;

public class StackEmptyException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public StackEmptyException(String errorMessage) {
        super(errorMessage);
    }

}
