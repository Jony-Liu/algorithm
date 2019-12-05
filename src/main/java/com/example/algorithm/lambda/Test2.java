package com.example.algorithm.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Java8四大内置函数式接口
 *
 * @author jonyliu
 */
public class Test2 {

    @Test
    public void test1() {
        strPrint("hello", (str) -> System.out.println(str));
    }

    /**
     * Consumer 消费性接口：void accept(T t)
     *
     * @param str      String.
     * @param consumer Comsumer.
     */
    private static void strPrint(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }


    @Test
    public void test2() {
        ArrayList<Integer> res = getNumList(10, () -> (int) (Math.random() * 100));
        System.out.println(res);
    }

    /**
     * Supplier供给型接口：T get()
     *
     * @param num number.
     * @param sup Represents a supplier of results.
     * @return List
     */
    private static ArrayList<Integer> getNumList(int num, Supplier<Integer> sup) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer e = sup.get();
            list.add(e);
        }
        return list;
    }

    @Test
    public void test3() {
        String result = strHandler("abc", (str) -> str.toUpperCase());
        System.out.println(result);
        result = strHandler(" abc ", (str) -> str.trim());
        System.out.println(result);
    }

    /**
     * Function 函数式接口：R apply(T t)
     *
     * @param str String.
     * @param fun Represents a function that accepts one argument and produces a result.
     * @return String
     */
    private static String strHandler(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

    @Test
    public void test4() {
        List<String> list = Arrays.asList("Java", "hello", "world", "ketty");
        List<String> result = filterStr(list, (str) -> str.length() > 4);
        System.out.println(result.toString());
    }

    /**
     * Predicate 函数式接口：test(T t);
     *
     * @param list List.
     * @param pre  Represents a predicate (boolean-valued function) of one argument.
     * @return List
     */
    public static List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str))
                result.add(str);
        }
        return result;
    }
}