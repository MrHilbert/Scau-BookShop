package com.example.library.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.service.UserLoginServiceImpl;
import com.example.library.utils.Constant;
import com.example.library.web.response.BaseResponse;


@RestController
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserLoginServiceImpl userLoginServiceImpl;

	@RequestMapping(value = "/User/login")
	public BaseResponse<String> Login(String account, String password) {
		BaseResponse<String> response;
		try {
			String loginResult = userLoginServiceImpl.Login(account, password);
			response = BaseResponse.success(loginResult);
		} catch (Exception e) {
            response = BaseResponse.fail(Constant.COMMON_ERROR);
            logger.error(e.getMessage());
		}
		return response;
	}
	
}