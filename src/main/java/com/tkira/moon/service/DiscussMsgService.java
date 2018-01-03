package com.tkira.moon.service;

import com.tkira.moon.entity.DiscussMsg;
import com.tkira.moon.entity.model.DiscussMsgModel;

public interface DiscussMsgService {
	
	void addDiscussMsgService(DiscussMsg discussMsg);

	DiscussMsg getOneDiscussMsg(Integer id);
	
	DiscussMsgModel getThreeLayersMsgs(Integer id);
	
	DiscussMsg getOneWayMsgs(Integer id);
}
