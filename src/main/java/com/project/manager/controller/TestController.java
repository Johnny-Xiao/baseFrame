package com.project.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.manager.util.RedisUtil;
import com.project.manager.util.ReturnMessage;

@RequestMapping("/test")
@Controller
public class TestController extends BaseController{
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	@ResponseBody
	public ReturnMessage test() {
		RedisUtil redisUtil = new RedisUtil();
		return renderSuccess(redisUtil.getCacheObject("test1"));
	}
}
