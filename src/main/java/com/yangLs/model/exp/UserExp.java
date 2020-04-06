package com.yangLs.model.exp;

import java.util.List;

import com.yangLs.model.Role;
import com.yangLs.model.User;

public class UserExp extends User{
	
	private List<Role> roles;

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
