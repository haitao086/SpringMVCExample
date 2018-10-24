package com.demo.models;

import java.util.ArrayList;
import java.util.List;
import com.demo.entities.Role;

public class RoleModel {

	private List<Role> roles;

	public RoleModel() {
		this.roles = new ArrayList<Role>();
		this.roles.add(new Role("r1", "Role 1"));
		this.roles.add(new Role("r2", "Role 2"));
		this.roles.add(new Role("r3", "Role 3"));
		this.roles.add(new Role("r4", "Role 4"));
	}

	public List<Role> findAll() {
		return this.roles;
	}

	public Role find(String id) {
		for (Role role : this.roles) {
			if (role.getId().equalsIgnoreCase(id)) {
				return role;
			}
		}
		return null;
	}

}