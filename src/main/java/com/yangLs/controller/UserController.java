package com.yangLs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yangLs.dao.UserMapper;
import com.yangLs.dao.exp.UserMapperExp;

@Controller
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserMapperExp userMapperExp;
	
	@RequestMapping("find")
	public String queryUser() {
		
		System.out.println(userMapper.selectByPrimaryKey(1));
		System.out.println(userMapperExp.selectUserAndRoleByUserId(1));
		return "success";
	}

}
