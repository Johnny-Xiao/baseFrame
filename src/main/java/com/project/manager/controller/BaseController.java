package com.project.manager.controller;

import com.project.manager.util.ReturnMessage;

public class BaseController {

	public ReturnMessage renderSuccess() {
		ReturnMessage message = new ReturnMessage();
		message.setSuccess(true);
		return message;
	}

	public ReturnMessage renderSuccess(Object object) {
		ReturnMessage message = new ReturnMessage();
		message.setObject(object);
		message.setSuccess(true);
		return message;
	}
	
	public ReturnMessage renderSuccess(Object object, String msg) {
		ReturnMessage message = new ReturnMessage();
		message.setObject(object);
		message.setSuccess(true);
		message.setMessage(msg);
		return message;
	}

	public ReturnMessage renderSuccess(String msg) {
		ReturnMessage message = new ReturnMessage();
		message.setMessage(msg);
		message.setSuccess(true);
		return message;
	}

	public ReturnMessage renderError(String msg) {
		ReturnMessage message = new ReturnMessage();
		message.setSuccess(false);
		message.setMessage(msg);
		return message;
	}
}
