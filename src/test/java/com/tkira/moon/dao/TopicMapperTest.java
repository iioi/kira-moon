package com.tkira.moon.dao;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.User;
import com.tkira.test.BaseTest;

public class TopicMapperTest extends BaseTest {

	@Autowired
	private TopicMapper topicMapper;
	
	@Test
	public void testInsert() {
		Topic topic = new Topic();
		topic.setName("test topic");
		User user = new User();
		user.setId(1);
		topic.setModerator(user);
		topic.setIntroduction("test introduction");
		topic.setCreateDate(new Date());
		topicMapper.insert(topic);
	}

	@Test
	public void testInsertHis() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerySimpleInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryChildrenInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryChildrenCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryHisCountByLinkId() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryHisLimByLinkId() {
		fail("Not yet implemented");
	}

}
