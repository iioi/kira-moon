package com.tkira.moon.util;

public class RegexHepler {

	public static String EMAIL_REGEX = "^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

	public static boolean isEmail(String str) {
		return str.matches(EMAIL_REGEX);
	}
	
	public static boolean isUserNo(String str) {
		return str.matches("\\d{9}");
	}
	
	public static boolean isTelephone(String str) {
		return str.matches("1[356789]\\d{9}");
	}
}
