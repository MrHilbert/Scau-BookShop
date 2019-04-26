package com.example.library.entity;

import lombok.Data;

/**
 * 数据库实体类用户信息
 * @author Hilbert
 * @Date 2019.4.23
 */
@Data
public class User {
	private Integer id;

	private String name;

	private String phone;

	private String adress;

	private String account;

	private String password;
}
