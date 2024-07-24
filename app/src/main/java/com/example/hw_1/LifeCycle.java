package com.example.hw_1;

public enum LifeCycle {
    ON_CREATE("onCreate"),
    ON_DESTROY("onDestroy"),
    ON_STOP("onStop"),
    ON_START("onStart"),
    ON_PAUSE("onPause"),
    ON_RESUME("onResume"),
    ON_RESTART("onRestart");

    public String getMessage() {
        return message;
    }

    private final String message;

    LifeCycle(String message) {
        this.message = message;
    }
}
