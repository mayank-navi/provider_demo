package com.spring_demo_9hr.demo.errors;

public class ProviderNotFoundExceptions extends Exception {
    public ProviderNotFoundExceptions() {
        super();
    }

    public ProviderNotFoundExceptions(String message) {
        super(message);
    }

    public ProviderNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ProviderNotFoundExceptions(Throwable cause) {
        super(cause);
    }

    protected ProviderNotFoundExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
