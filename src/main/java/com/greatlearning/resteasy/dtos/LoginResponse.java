package com.greatlearning.resteasy.dtos;

public class LoginResponse {
    private String username;
    private String message;
    private String token;

    public LoginResponse() {
    }

    public LoginResponse(String username, String message, String token) {
        this.username = username;
        this.message = message;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "username='" + username + '\'' +
                ", message='" + message + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
