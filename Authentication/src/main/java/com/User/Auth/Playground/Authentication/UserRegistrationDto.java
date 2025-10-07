package com.User.Auth.Playground.Authentication;

public class UserRegistrationDto {
    private String username;
    private String email;
    private String password;
    private String roles; // <-- Add this field

    // Default constructor
    public UserRegistrationDto() {}

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRoles() { // <-- Getter for roles
        return roles;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(String roles) { // <-- Setter for roles
        this.roles = roles;
    }
}
