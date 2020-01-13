package com.project.agriculture.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
@Embeddable
public class GenderEntity implements Serializable {
    
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "gender_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genderId;

    @Column(name = "gender_name")
    private String genderName;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;
    
    public Long getGenderId() {
		return this.genderId;
	}

	public void setGenderId(Long genderId) {
		this.genderId = genderId;
    }

    public String getGenderName() {
		return this.genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
    }
    

    
    
}