package com.example.algorithm.reflect;



import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class PersonReflect {
	@Test
	public void test1() throws Exception {
		ClassLoader classloader = this.getClass().getClassLoader();
		Class clazz = classloader.loadClass("com.example.algorithm.reflect.Person");
		Person p = (Person)clazz.newInstance();
		System.out.println(p);
	}

	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		Class clazz = Person.class;
		Person p1 = (Person) clazz.newInstance();
		System.out.println(p1);
		Field field=clazz.getDeclaredField("name");
		field.setAccessible(true);
		field.set(p1, "马德华");
		String st = p1.toString();
		System.out.println(st);
		Method method = clazz.getMethod("show");
		method.invoke(p1);
		Method method1 = clazz.getDeclaredMethod("show", String.class);
		method1.setAccessible(true);
		method1.invoke(p1, "周杰伦");
	}

}
