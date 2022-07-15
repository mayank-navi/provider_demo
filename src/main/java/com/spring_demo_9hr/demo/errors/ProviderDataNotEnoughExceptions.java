package com.spring_demo_9hr.demo.errors;

public class ProviderDataNotEnoughExceptions extends Exception {
    public ProviderDataNotEnoughExceptions() {
        super();
    }

    public ProviderDataNotEnoughExceptions(String message) {
        super(message);
    }

    public ProviderDataNotEnoughExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ProviderDataNotEnoughExceptions(Throwable cause) {
        super(cause);
    }

    protected ProviderDataNotEnoughExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
