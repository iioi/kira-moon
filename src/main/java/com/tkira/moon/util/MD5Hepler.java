package com.tkira.moon.util;

import java.security.MessageDigest;

public class MD5Hepler {

	// 生成MD5
	public static String getMD5(String message) {
		String md5 = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageBytes = message.getBytes("UTF-8");
			byte[] md5Bytes = md.digest(messageBytes);
			md5 = bytesToHex(md5Bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return md5;
	}

	// 二进制转十六进制
	public static String bytesToHex(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		int num;
		for (int i = 0; i < bytes.length; i++) {
			num = bytes[i];
			if (num < 0) {
				num += 256;
			}
			if (num < 16) {
				sb.append("0");
			}
			sb.append(Integer.toHexString(num));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = getMD5("1234");
		System.out.println(str);
	}
}
