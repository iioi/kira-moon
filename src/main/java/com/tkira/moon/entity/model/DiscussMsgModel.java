package com.tkira.moon.entity.model;

import java.util.List;

import com.tkira.moon.entity.DiscussMsg;

public class DiscussMsgModel extends DiscussMsg {

	private List<DiscussMsgModel> childrenMsg;

	private Boolean isHead;

	private Boolean isFoot;

	private DiscussMsgModel childMsg;
	
	public DiscussMsgModel() {
		
	}
	
	public DiscussMsgModel(DiscussMsg discussMsg,Boolean isHead,Boolean isFoot) {
		this.setId(discussMsg.getId());
		this.setContent(discussMsg.getContent());
		this.setShortMsg(discussMsg.getShortMsg());
		this.setSysUser(discussMsg.getSysUser());
		this.setParentMsg(discussMsg.getParentMsg());
		this.isHead = isHead;
		this.isFoot = isFoot;
	}

	public List<DiscussMsgModel> getChildrenMsg() {
		return childrenMsg;
	}

	public void setChildrenMsg(List<DiscussMsgModel> childrenMsg) {
		this.childrenMsg = childrenMsg;
	}

	public Boolean getIsHead() {
		return isHead;
	}

	public void setIsHead(Boolean isHead) {
		this.isHead = isHead;
	}

	public Boolean getIsFoot() {
		return isFoot;
	}

	public void setIsFoot(Boolean isFoot) {
		this.isFoot = isFoot;
	}

	public DiscussMsgModel getChildMsg() {
		return childMsg;
	}

	public void setChildMsg(DiscussMsgModel childMsg) {
		this.childMsg = childMsg;
	}

}
