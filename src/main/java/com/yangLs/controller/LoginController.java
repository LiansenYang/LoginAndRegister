package com.yangLs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yangLs.Constants;
import com.yangLs.dao.UserMapper;
import com.yangLs.form.UserForm;
import com.yangLs.model.User;
import com.yangLs.model.UserExample;

@Controller
public class LoginController {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * get请求的login方法做一些login前的准备
	 * @return
	 */
	@RequestMapping(value = {"/","/login"},method = RequestMethod.GET)
	public String toLogin(Model model) {
		model.addAttribute("userForm", new UserForm());
		return "framework/login";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(UserForm userForm,HttpServletRequest request,Model model) {
		
		//验证是否存在客户
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(userForm.getUserName()).andPasswordEqualTo(userForm.getPassword());
		List<User> users = userMapper.selectByExample(userExample);
		
		System.out.println(userMapper.selectByPrimaryKey(1));
		
		//登陆成功，放到session对象
		if(users != null && users.size() >0) {
			User user = users.get(0);
			request.getSession().setAttribute(Constants.USER_SESSION, user);
		//登陆失败，重新回到登陆页面，提示登录错误信息
		}else {
			model.addAttribute("msg", "用户名密码不存在！请重新登录");
			return "framework/login";
		}
		return "framework/index";
	}

}
