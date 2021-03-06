package com.visenze.visearch;

public class ViSearchException extends RuntimeException {

    protected String json;

    public ViSearchException(String message) {
        super(message);
    }

    public ViSearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public ViSearchException(String message, String json) {
        super(message);
        this.json = json;
    }

    public ViSearchException(String message, Throwable cause, String json) {
        super(message, cause);
        this.json = json;
    }

    public String getJson() {
        return json;
    }
}
