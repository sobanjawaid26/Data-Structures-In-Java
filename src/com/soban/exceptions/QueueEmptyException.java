package com.soban.exceptions;

public class QueueEmptyException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public QueueEmptyException(String errorMessage) {
        super(errorMessage);
    }

}
