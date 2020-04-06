package com.yangLs.dao.exp;

import com.yangLs.model.exp.UserExp;

public interface UserMapperExp {
	
	public UserExp selectUserAndRoleByUserId(int userId);
}
