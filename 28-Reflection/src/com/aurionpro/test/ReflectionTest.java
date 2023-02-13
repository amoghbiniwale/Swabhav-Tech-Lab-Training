package com.aurionpro.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			reflection(Class.forName(args[0]));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void reflection(Class inputClass) {
		System.out.println("The Class Name is:" + inputClass.getName());
		System.out.println();

		Field field[] = inputClass.getDeclaredFields();
		System.out.println("Class Fields:");

		for (Field f : field) {
			System.out.println(f);

		}
		System.out.println();
		Method method[] = inputClass.getDeclaredMethods();
		System.out.println("Class Methods:");
		for (Method m : method) {
			System.out.println(m);
		}
	}
}
