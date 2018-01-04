package com.tkira.moon.entity;

import com.tkira.moon.entity.auth.SysUser;

import lombok.Data;

@Data
public class DiscussMsg {

	private Integer id;
	private String content;
	private String shortMsg;
	private SysUser sysUser;
	private DiscussMsg parentMsg;
	
}
