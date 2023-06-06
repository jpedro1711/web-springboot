package com.joaopedroigeskimorais.course.resources.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class StandartError implements Serializable {
    private static final long serialVersionUID =1L;
    private Instant timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandartError(){

    }

    public StandartError(Instant timeStamp, Integer status, String error, String message, String path) {
        super();
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
