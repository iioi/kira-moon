package com.tkira.moon.dao;

import java.util.List;

import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.his.TopicHis;

public interface TopicMapper {

	int insert(Topic topic);
	
	int insertHis(TopicHis topicHis);
	
	int insertTopicManagerRF(Topic topic);
	
	int insertTopicManagerHisRF(TopicHis topicHis);
	
	int deleteTopicManagerRF(Integer topicId);
	
	int deleteTopicManagerHisRF(Integer topicId);
	
	Topic querySimpleInfo(Integer id);
	
	List<Topic> queryChildrenInfo(Integer id);
	
	int queryChildrenCount(Integer id);
	
	int queryHisCountByLinkId(Integer id);
	
	List<TopicHis> queryHisLimByLinkId(Integer id);
}
