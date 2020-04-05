package com.yangLs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yangLs.dao.UserMapper;

@Controller
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("find")
	public String queryUser() {
		System.out.println("hi");
		return "success";
	}

}
