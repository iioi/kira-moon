package com.tkira.moon.entity;

import java.util.Date;

import lombok.Data;

@Data
public class DiscussionReply {

	private Integer id;
	private String content;
	private Date createTime;
	private Integer status;
	private User author;
	private Discussion discussion;
	private DiscussionReply parentReply;

}
