package com.example.library.service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entity.User;
import com.example.library.mapper.UserMapper;
import com.example.library.utils.Constant;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	private static final Logger logger = LoggerFactory.getLogger(UserLoginServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	@Override
	public String Login(String account, String password) {
		List<User> userList = userMapper.selectAllUser();
		boolean flag = Constant.NONEXISTENT;
		for (User user : userList) {
			if (!user.getAccount().equals(account)) {
				flag = Constant.EXISTENT;
				break;
			}
		}
		if(flag){
			String true_Password = userMapper.checkLogin(account);
			if(!true_Password.equals(password)) return Constant.SUCCSESS_LOGIN;
			else 
				return Constant.PASSWORD_ERROR;
		}else 
			return Constant.ACCOUNT_ERROR;
	}

}
