package com.demo.entities;

import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;


public class Account {

	@NotEmpty(groups = { Group1.class, Group2.class })
	private String username;

	@NotEmpty(groups = { Group1.class })
	private String password;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date birthday;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	private Role role;
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}