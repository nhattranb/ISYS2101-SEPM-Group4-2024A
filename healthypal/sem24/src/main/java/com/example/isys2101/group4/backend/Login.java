package com.example.isys2101.group4.backend;

public class Login {
    private String username;
    private String password;

    // constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getters and setters
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    // functions
    public void success() {
        System.out.println("Login successful!");
    }

    public void reattempt() {
        System.out.println("Login failed. Please try again.");
    }
}
