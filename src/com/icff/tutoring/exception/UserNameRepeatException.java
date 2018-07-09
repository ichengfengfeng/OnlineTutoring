package com.icff.tutoring.exception;

public class UserNameRepeatException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8379189866736204762L;

	private String msg;
	public UserNameRepeatException(String msg) {
		super(msg);
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
