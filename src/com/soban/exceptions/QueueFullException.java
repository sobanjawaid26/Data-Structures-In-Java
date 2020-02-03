package com.soban.exceptions;

public class QueueFullException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public QueueFullException(String errorMessage) {
        super(errorMessage);
    }

}
