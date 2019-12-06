package com.example.algorithm.lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * 方法引用与构造器引用
 */
public class Test3 {

    /**
     * 要求：实现抽象方法的参数列表和返回值类型，必须与方法引用的
     * 方法的参数列表和返回值类型保持一致
     *
     * 对象::实例方法名
     * 类::静态方法名
     * 类::实例方法名
     */
    @Test
    public void test(){
        Comparator<Integer> comparator = (x, y)->Integer.compare(x,y);
        Comparator<Integer> comparator1 = Integer::compare;
        int compare = comparator.compare(1,2);
        int compare1 = comparator1.compare(1,2);
        System.out.println("compare:"+compare);
        System.out.println("compare1:"+compare1);
    }
}
