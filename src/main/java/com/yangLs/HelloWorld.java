package com.yangLs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloWorld {
	
	@RequestMapping("hi")
	public String hi() {
		System.out.println("hi");
		return "success";
	}

}
