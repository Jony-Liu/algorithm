package com.example.algorithm.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class AnnotationTest {



    @Test
    public void test010() throws Exception {
        Method showMethod = Person.class.getMethod("show");
        MyAnnoation myAnnoation = showMethod.getAnnotation(MyAnnoation.class);
        System.out.println("val:"+myAnnoation.val()+"----str:"+myAnnoation.str());

        Method displayMethod = Person.class.getMethod("display",String.class);
        myAnnoation = displayMethod.getAnnotation(MyAnnoation.class);
        System.out.println("val:"+myAnnoation.val()+"----str:"+myAnnoation.str());

        Annotation[] annotations = displayMethod.getAnnotations();
        for (Annotation a :
                annotations) {
            System.out.println(a.annotationType().equals(MyAnnoation.class));
            
        }
        System.out.println();

    }
    @Test
    public void test8() throws Exception {
        Class clazz = Class.forName("com.example.algorithm.annotation.Person");
        Type type = clazz.getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        Type[] types = pt.getActualTypeArguments();
        for (Type type2 : types) {
            System.out.println(type2);

        }
    }

    @Test
    public void test7() throws Exception {
        ClassLoader load = this.getClass().getClassLoader();
        Class clazz = load.loadClass("com.example.algorithm.annotation.Person");
        System.out.println(clazz);

    }

    @Test
    public void test6() throws Exception {
        Class clazz = Class.forName("com.example.algorithm.annotation.Person");
        Field[] fields = clazz.getFields();// 获得公共属性
        for (Field field : fields) {
            System.out.println(field);
        }
        fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.print("名称：" + field.getName());
            System.out.println("\t" + field);

        }

    }

    @Test
    public void test5() throws Exception {
        Class clazz = Person.class;
        Package p = clazz.getPackage();
        System.out.println(p);
        Method method = clazz.getMethod("display", String.class);
        System.out.println(method.getReturnType());
    }

    @Test
    public void test4(){
        Class clazz = Person.class;
        Annotation[] anns = clazz.getAnnotations();
        for (Annotation annotation : anns) {
            System.out.println(annotation);
        }

    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("com.example.algorithm.annotation.Person");
        System.out.println("所有的构造器");
        Constructor[] con = clazz.getConstructors();
        for (Constructor constructor : con) {
            System.out.print("修饰符: " + Modifier.toString(constructor.getModifiers()));
            System.out.print("  名字: " + constructor.getName());
            System.out.println("  完整格式: " + constructor);

        }
        System.out.println("public 修饰的构造器");
        Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);

        }
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.example.algorithm.annotation.Person");
        Class clazzs = clazz.getSuperclass();
        System.out.println(clazzs);

        System.out.println("-----------------");
        clazz = Person.class;
        Type type = clazz.getGenericSuperclass();
        System.out.println(type);

    }

    @Test
    public void test01() throws Exception{
        Class clazz = Class.forName("com.example.algorithm.annotation.Person");
        Class[] clazzs = clazz.getInterfaces();
        for (Class class1 : clazzs) {
            System.out.println(class1);
        }
        System.out.println("----------------");
        clazz = Person.class;
        Class parent = clazz.getSuperclass();
        System.out.println(parent);
    }

    @Test
    public void test() throws Exception {
        Annotation[] ann = Class.forName("com.example.algorithm.annotation.Person01").getMethod("toString").getAnnotations();
        //ann =Class.forName("com.example.algorithm.annotation.Test").getMethod("toString").getAnnotations();
        for (Annotation annotation : ann) {
            System.out.println(annotation);
        }
    }
}
