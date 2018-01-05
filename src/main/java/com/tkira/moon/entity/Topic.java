package com.tkira.moon.entity;

import java.util.Date;
import java.util.List;

import com.tkira.moon.util.ReflectionHelper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Topic {

	private Integer id;
	private String name;
	// 版主（只有一人）
	private User moderator;
	// 管理员（可以有多个）
	private List<User> managers;
	private String introduction;
	private String detail;
	private Integer status;
	private Date createDate;
	private Date updateDate;
	private Topic parentTopic;
	
	private List<Topic> childrenTopics;
	
	private Integer updateCount;

	public Topic(Topic topic) {
		ReflectionHelper.beanFieldsCopy(this, topic);
	}
}
