package com.tkira.moon.util;

import java.lang.reflect.Field;

import com.tkira.moon.entity.Topic;

public class ReflectionHelper {

	public static <T> void beanFieldsCopy(T target, T bean) {
		Class<?> clazz = bean.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			try {
				field.set(target, field.get(bean));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {
		Topic topic = new Topic();
		topic.setDetail("heheda");
		Topic topic2 = new Topic();
		beanFieldsCopy(topic2, topic);
		System.out.println(topic2.getDetail());
	}
}
