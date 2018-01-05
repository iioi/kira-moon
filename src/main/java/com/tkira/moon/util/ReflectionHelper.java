package com.tkira.moon.util;

import java.lang.reflect.Field;

public class ReflectionHelper {

	public static <T> void beanFieldsCopy(T target, T bean) {
		Class<?> clazz = target.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			try {
				field.set(target, field.get(target));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {

	}
}
