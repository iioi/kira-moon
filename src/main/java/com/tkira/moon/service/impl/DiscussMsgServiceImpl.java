package com.tkira.moon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkira.moon.dao.DiscussMsgMapper;
import com.tkira.moon.entity.DiscussMsg;
import com.tkira.moon.entity.model.DiscussMsgModel;
import com.tkira.moon.service.DiscussMsgService;

@Service
public class DiscussMsgServiceImpl implements DiscussMsgService {

	@Autowired
	private DiscussMsgMapper discussMsgMapper;
	
	@Override
	public void addDiscussMsgService(DiscussMsg discussMsg) {
		discussMsgMapper.insert(discussMsg);
	}

	@Override
	public DiscussMsg getOneDiscussMsg(Integer id) {
		return discussMsgMapper.querySimpleById(id);
	}

	@Override
	public DiscussMsgModel getThreeLayersMsgs(Integer id) {
		DiscussMsg discussMsg = discussMsgMapper.querySimpleById(id);
		if (discussMsg == null)
			return null;
		DiscussMsgModel headMsg = new DiscussMsgModel(discussMsg, true, false);
		setChildMsg(headMsg, 3);
		return headMsg;
	}

	private void setChildMsg(DiscussMsgModel parentMsg, int layerNum) {
		Integer parentId = parentMsg.getId();
		if (layerNum == 0) {
			if (discussMsgMapper.queryChildrenCount(parentId) > 0)
				parentMsg.setIsFoot(false);
			else
				parentMsg.setIsFoot(true);
			return;
		}
		List<DiscussMsgModel> childrenMsg = discussMsgMapper.queryModelsByParentId(parentId);
		parentMsg.setChildrenMsg(childrenMsg);
		for (DiscussMsgModel discussMsgModel : childrenMsg) {
			setChildMsg(discussMsgModel, layerNum - 1);
		}
	}

	@Override
	public DiscussMsg getOneWayMsgs(Integer id) {
		DiscussMsg discussMsg = discussMsgMapper.querySimpleById(id);
		DiscussMsg currentMsg = discussMsg;
		while (currentMsg.getParentMsg().getId() != null) {
			DiscussMsg parentMsg = discussMsgMapper.querySimpleById(currentMsg.getParentMsg().getId());
			currentMsg.setParentMsg(parentMsg);
		}
		return discussMsg;
	}

}
