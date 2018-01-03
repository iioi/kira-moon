package com.tkira.moon.web;

import static com.tkira.moon.util.CustomResult.trueResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkira.moon.entity.DiscussMsg;
import com.tkira.moon.entity.model.DiscussMsgModel;
import com.tkira.moon.service.DiscussMsgService;
import com.tkira.moon.util.CustomResult;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/discussMsg")
public class DicussMsgController {

	@Autowired
	private DiscussMsgService discussMsgService;

	@ApiOperation(value = "添加message的方法")
	@ApiImplicitParam(name = "discussMsg", value = "消息的实体，sysUser和parentMsg只需传属性", required = true, dataType="DiscussMsg")
	@PostMapping("/add")
	private CustomResult addNewMsg(@RequestBody DiscussMsg discussMsg) {
		discussMsgService.addDiscussMsgService(discussMsg);
		return trueResult();
	}
	
	@GetMapping("/getThreeLayersMsgs")
	public CustomResult getThreeLayersMsgs(Integer id) {
		DiscussMsgModel msgModel = discussMsgService.getThreeLayersMsgs(id);
		return trueResult(msgModel);
	}
}
