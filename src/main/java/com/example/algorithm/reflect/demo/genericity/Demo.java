package com.example.algorithm.reflect.demo.genericity;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 通过反射越过泛型检查
 *
 * 例如：有一个String泛型的集合，怎样能向这个集合中添加一个Integer类型的值？
 */
/**
 * @author Jony-Liu
 * @date 2020/5/20 23:08
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");

        //  strList.add(100);
        //获取ArrayList的Class对象，反向的调用add()方法，添加数据
        Class listClass = strList.getClass(); //得到 strList 对象的字节码 对象
        //获取add()方法
        Method m = listClass.getMethod("add", Object.class);
        //调用add()方法
        m.invoke(strList, 100);

        //遍历集合
        for(Object obj : strList){
            System.out.println(obj);
        }
    }
}