package com.yangLs.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class BusinessExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		String errorViewString = "framework/error";
		if(handler instanceof HandlerMethod){
			HandlerMethod method = (HandlerMethod)handler;
//TODO 没有加入ErrorView
//			ErrorView errorView = method.getMethodAnnotation(ErrorView.class);
//			if(errorView!=null&&StringUtils.isNotBlank(errorView.value())){
//				errorViewString = errorView.value();
//			}
		}
		//handler就是处理器适配器要执行Handler对象（只有method）

		//解析出异常类型
		//如果该异常类型是系统自定义的异常，直接取出异常信息，在错误页面显示
		BusinessException customException = null;
		if(ex instanceof BusinessException){
			customException = (BusinessException)ex;
		}else{
			customException = new BusinessException(ex.getMessage());
		}
		//错误信息
		String message = customException.getMessage();

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("message", message);

		//添加上args
		StringBuffer buff = new StringBuffer();
		if(customException.getArgs() != null && customException.getArgs().length > 0 ){
			for(int i = 0; i < customException.getArgs().length; ++i) {
				buff.append(customException.getArgs()[i]);
				if(i+1 != customException.getArgs().length){
					buff.append(",");
				}
			}
		}
		modelAndView.addObject("args", buff.toString());

		modelAndView.setViewName(errorViewString);

		return modelAndView;
	}

}
