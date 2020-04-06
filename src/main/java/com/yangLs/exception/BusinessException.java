package com.yangLs.exception;

public class BusinessException extends Exception {
	/**
	 * @Fields message : 异常信息
	 */
	public String message;
	private Object[] args;

	public Object[] getArgs() {
		return this.args;
	}

	public BusinessException() {
		super();
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}
	public BusinessException(String message) {
		super(message);
		this.message = message;
	}
	public BusinessException(String message, Object[] args) {
		super(message);
		this.message = message;
		this.args = args;
	}

	public String getMessage() {
		return message;
	}
}
