package com.tkira.moon.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.model.CustomResult;

@RestController
@RequestMapping("/topic")
public class TopicController {
	
	

	@PostMapping("/add")
	public CustomResult addNewTopic(@RequestBody Topic topic) {
		
		return null;
	}
}
