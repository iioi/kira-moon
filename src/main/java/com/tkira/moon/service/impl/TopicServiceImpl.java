package com.tkira.moon.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkira.moon.dao.TopicMapper;
import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.User;
import com.tkira.moon.entity.his.TopicHis;
import com.tkira.moon.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicMapper topicMapper;

	@Override
	@Transactional
	public void addTopic(Topic topic, User operateUser) {
		// set createDate and updateDate
		topic.setCreateDate(new Date());
		topic.setUpdateDate(new Date());
		// save to database
		topicMapper.insert(topic);
		// create his bean and save
		TopicHis topicHis = new TopicHis(topic, operateUser);
		topicMapper.insertHis(topicHis);
	}

	@Override
	public void updateTopic(Topic topic,User operateUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TopicHis> findTopicHis(Integer topicId) {
		// TODO Auto-generated method stub
		return null;
	}

}
