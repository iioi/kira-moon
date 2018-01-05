package com.tkira.moon.service;

import java.util.List;

import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.User;
import com.tkira.moon.entity.his.TopicHis;

public interface TopicService {

	void addTopic(Topic topic, User operateUser);

	void updateTopic(Topic topic, User operateUser);

	List<TopicHis> findTopicHis(Integer topicId);
}
