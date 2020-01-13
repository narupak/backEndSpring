package com.project.agriculture.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private String username;
    private String password;

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

    //need default constructor for JSON Parsing
    public JwtRequest(){

    }

    public JwtRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

}