package com.project.manager.service.impl;

import org.springframework.stereotype.Service;

import com.project.manager.service.IBaseService;

/**
 * 
 * @author Johnny_Xiao
 *方便service扩展
 */

@Service("baseService")
public class BaseServiceImpl implements IBaseService{
	public void test() {
		System.out.println("test");
	}
}
