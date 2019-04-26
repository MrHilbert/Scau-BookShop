package com.example.library.service;

import com.example.library.entity.User;
import com.example.library.web.response.BaseResponse;

public interface UserLoginService {
	/**
	 * 登录验证
	 * @param account
	 * @param password
	 * @return
	 */
	String Login(String account,String password);
	
}
