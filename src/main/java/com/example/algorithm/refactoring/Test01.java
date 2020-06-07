package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/7 17:53
 */
public class Test01 {

    public static void main(String[] args) {
        GoodExample goodExample = new GoodExample();
        goodExample.someMethod1();
        goodExample.someMethod2();
    }

}
class BadExample {

    public void someMethod1(){
        //code
        System.out.println("重复代码");/* 重复代码块 */
        //code
    }

    public void someMethod2(){
        //code
        System.out.println("重复代码");/* 重复代码块 */
        //code
    }

}

/* ---------------------分割线---------------------- */

class GoodExample {

    public void someMethod1(){
        //code
        someMethod3();
        //code
    }

    public void someMethod2(){
        //code
        someMethod3();
        //code
    }

    public void someMethod3(){
        System.out.println("重复代码");/* 重复代码块 */
    }

}
