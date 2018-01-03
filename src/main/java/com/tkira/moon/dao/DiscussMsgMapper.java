package com.tkira.moon.dao;

import java.util.List;

import com.tkira.moon.entity.DiscussMsg;
import com.tkira.moon.entity.model.DiscussMsgModel;

public interface DiscussMsgMapper {

	int insert(DiscussMsg discussMsg);
	
	DiscussMsg querySimpleById(Integer id);
	
	List<DiscussMsgModel> queryModelsByParentId(Integer parentId);
	
	int queryChildrenCount(Integer parentId);
}
