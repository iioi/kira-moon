package com.tkira.moon.entity.his;

import com.tkira.moon.entity.Topic;
import com.tkira.moon.entity.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class TopicHis extends Topic {

	private User updateUser;
	
	private Topic linkTopic;
	
	public TopicHis(Topic topic, User updateUser) {
		super(topic);
		this.linkTopic = topic;
		this.updateUser = updateUser;
	}
}
