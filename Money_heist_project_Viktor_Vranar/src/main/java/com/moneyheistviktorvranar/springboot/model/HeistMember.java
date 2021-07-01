package com.moneyheistviktorvranar.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MoneyHeistMembers")
public class HeistMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "skills")
	private skill[] Skills;
	
	@Column(name = "mainSkill")
	private skill mainSkill;
	
	@Column(name = "status")
	private String status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public skill[] getSkills() {
		return Skills;
	}
	public void setSkills(skill[] skills) {
		Skills = skills;
	}
	public skill getMainSkill() {
		return mainSkill;
	}
	public void setMainSkill(skill mainSkill) {
		this.mainSkill = mainSkill;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

