package com.project.agriculture.model;

import java.io.Serializable;

public class JwtToken implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}