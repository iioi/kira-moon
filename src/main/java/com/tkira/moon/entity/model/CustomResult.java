package com.tkira.moon.entity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomResult {

	private boolean result;
	private String msg;
	private Object content;

	public static CustomResult trueResult() {
		return new CustomResult(true, null, null);
	}

	public static CustomResult trueResult(Object content) {
		return new CustomResult(true, null, content);
	}

	public static CustomResult falseResult() {
		return new CustomResult(false, null, null);
	}

	public static CustomResult falseResult(String msg) {
		return new CustomResult(false, msg, null);
	}
}
