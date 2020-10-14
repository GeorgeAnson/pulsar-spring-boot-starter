package com.github.georgeanson.pulsar.exception;

public class ConsumerInitException extends RuntimeException {
    public ConsumerInitException(String message, Throwable cause) {
        super(message, cause);
    }
}
