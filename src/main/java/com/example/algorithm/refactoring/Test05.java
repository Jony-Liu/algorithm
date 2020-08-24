package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/13 22:03
 * 去掉一次性的临时变量
 */
public class Test05 {

    public static void main(String[] args) {
        GoodExample05 goodExample05 = new GoodExample05();
        goodExample05.someMethod();
    }

}

class BadExample05 {

    private int i;

    public int someMethod(){
        int temp = getVariable();
        return temp * 100;
    }

    public int getVariable(){
        return i;
    }

}

/* ---------------------分割线---------------------- */

class GoodExample05 {

    private int i;

    public int someMethod(){
        return getVariable() * 100;
    }

    public int getVariable(){
        return i;
    }

}