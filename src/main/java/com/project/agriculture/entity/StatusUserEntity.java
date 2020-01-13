package com.project.agriculture.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status_user")
public class StatusUserEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_user_id")
    private long statusUserId;

    @Column(name = "status_suer_name")
    private String statusUserName;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;
    
    public long getStatusUserId() {
        return this.statusUserId;
    }

    public void setStatusUserId(long statusUserId) {
        this.statusUserId = statusUserId;
    }

    public String getStatusUserName() {
        return this.statusUserName;
    }

    public void setStatusUserName(String statusUserName) {
        this.statusUserName = statusUserName;
    }

    
} 