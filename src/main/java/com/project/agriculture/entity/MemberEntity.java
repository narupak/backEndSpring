package com.project.agriculture.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class MemberEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1156604518320875416L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_firstname")
    private String firstname;

    @Column(name = "member_lastname")
    private String lastname;

    @Column(name = "gender_id")
    private Long genderId;

    @Column(name = "member_email")
    private String email;

    @Column(name = "member_tel")
    private String tel;

    @Column(name = "member_username")
    private String username;

    @Column(name = "member_password")
    private String password;

    @Column(name = "member_role_id")
    private Long roleId;

    @Column(name = "create_by")
    private transient String createBy;

    @Column(name = "create_date")
    private transient String createDate;

    @Column(name = "update_by")
    private transient String updateBy;

    @Column(name = "update_date")
    private transient String updateDate;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getGenderId() {
        return this.genderId;
    }

    public void setGenderId(Long gender) {
        this.genderId = gender;
    }

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
    }

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

    
    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}