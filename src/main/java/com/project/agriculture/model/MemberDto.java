package com.project.agriculture.model;

import java.io.Serializable;

public class MemberDto implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 4581204181109779990L;
	private String username;
	private String password;
	private String email;
	private String tel;
	private String firstname;
	private String lastname;
	private Long genderId;
	private Long statusUserId;

	public String getUsername() {
		return this.username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Long getStatusUserId() {
		return statusUserId;
	}

	public void setStatusUserId(Long statusUserId) {
		this.statusUserId = statusUserId;
	}

	public Long getGenderId() {
		return genderId;
	}

	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(final String tel) {
		this.tel = tel;
	}
}