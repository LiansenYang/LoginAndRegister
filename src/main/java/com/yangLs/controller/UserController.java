package com.yangLs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public String queryUser(HttpServletRequest request,HttpServletResponse response) throws Exception, IOException {
		
		System.out.println(userMapper.selectByPrimaryKey(1));
		System.out.println(userMapperExp.selectUserAndRoleByUserId(1));
//		request.getRequestDispatcher("").forward(request, response);
		return "forward:/WEB-INF/views/success.jsp";
	}

}
