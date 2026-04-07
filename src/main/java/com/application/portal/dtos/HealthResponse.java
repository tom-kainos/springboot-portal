package com.application.portal.dtos;

public class HealthResponse {
    private String status;
    private String message;
    private String timestamp;
    private long userCount;

    public HealthResponse(String status, String message, String timestamp, long userCount) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
        this.userCount = userCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
