package com.example.algorithm.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * lambda表达式的一些常见用法
 * @author Jony-Liu
 */
public class Test4 {

    /**
     * 使用lambda表达式对集合进行迭代
     */
    @Test
    public void test1() {
        List<String> list = Arrays.asList("java", "c#", "javascript");
        //before java8
        for (String str : list) {
            System.out.println("before java8," + str);
        }
        //after java8
        list.forEach(x -> System.out.println("after java8," + x));
    }

    /**
     * 用lambda表达式实现map
     */
    @Test
    public void test2() {
        List<Double> list = Arrays.asList(10.0, 20.0, 30.0);
        list.stream().map(x -> x + x * 0.05).forEach(x -> System.out.println(x));
    }

    /**
     * 用lambda表达式实现map与reduce
     */
    @Test
    public void test3() {
        //before java8
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        double sum = 0;
        for (double each : cost) {
            each += each * 0.05;
            sum += each;
        }
        System.out.println("before java8," + sum);
        //after java8
        List<Double> list = Arrays.asList(10.0, 20.0, 30.0);
        double sum2 = list.stream().map(x -> x + x * 0.05).reduce((sum1, x) -> sum1 + x).get();
        System.out.println("after java8," + sum2);
    }

    /**
     * filter操作
     */
    @Test
    public void test4() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        filteredCost.forEach(x -> System.out.println(x));
    }

    /**
     * 与函数式接口Predicate配合
     */
    @Test
    public void test5() {
        List<String> languages = Arrays.asList("Java", "Python", "scala", "Shell", "R");
        filterTest(languages, x -> x.startsWith("J"));//Java
        filterTest(languages, x -> x.endsWith("a"));//Java,scala
        filterTest(languages, x -> true);//Java,Python,scala,Shell,R
        filterTest(languages, x -> false);//
        filterTest(languages, x -> x.length() > 4);//Python,scala,Shell,
    }

    public static void filterTest(List<String> languages, Predicate<String> condition) {
        languages.stream().filter(x -> condition.test(x)).forEach(x -> System.out.print(x + " "));
        System.out.print("\n");
    }

}
