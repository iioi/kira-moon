package com.tkira.moon.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Discussion {

	private Integer id;
	private String title;
	private Date createTime;
	private Integer status;
	private User author;
	private Topic topic;
	private Discussion parentDiscussion;

}
