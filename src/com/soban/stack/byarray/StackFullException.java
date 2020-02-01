package com.soban.stack.byarray;

public class StackFullException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public StackFullException(String errorMessage) {
        super(errorMessage);
    }

}
