package com.example.algorithm.reflect;



import java.lang.reflect.Constructor;
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

	/**
	 * Field, Method, Constructor 这些类的对象由jvm运行
	 * 时候创建，用以表示未知类里对应的成员
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		//fail("Not yet implemented");
		Class clazz = Person.class;
		Person p1 = (Person) clazz.newInstance();
		System.out.println(p1);
		//Field 成员属性
		Field field=clazz.getDeclaredField("name");
		field.setAccessible(true);
		field.set(p1, "刘德华");
		String st = p1.toString();
		System.out.println(st);
		//Method 公共成员方法
		Method method = clazz.getMethod("show");
		method.invoke(p1);
		//Method 所有方法（包括private方法）
		Method method1 = clazz.getDeclaredMethod("show", String.class);
		method1.setAccessible(true);
		method1.invoke(p1, "周杰伦");
		//Constructor 构造函数类型
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		Person p2 = (Person)constructor.newInstance("张学友",25);
		System.out.println(p2);
	}

}
