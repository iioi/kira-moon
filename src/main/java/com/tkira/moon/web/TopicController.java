package com.tkira.moon.web;

import static com.tkira.moon.entity.model.CustomResult.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.auth.SysUser;
import com.tkira.moon.entity.model.CustomResult;
import com.tkira.moon.service.TopicService;

@RestController
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@PostMapping("/add")
	public CustomResult addNewTopic(@RequestBody Topic topic) {
		// get current user
		SysUser sysUser = (SysUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		try {
			topicService.addTopic(topic, sysUser.convertToUser());
		}catch (Exception e) {
			e.printStackTrace();
			return falseResult();
		}
		return trueResult();
	}
}
