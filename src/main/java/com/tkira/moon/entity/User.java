package com.tkira.moon.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private Integer id;
	private String userNo;
	private String username;
	private String password;
	private String email;
	private String telephone;
	private String photoUrl;
	private String introduction;
	private Integer status;
	private Date createTime;
	private Date updateTime;

}
