package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/7 18:00
 */
public class Test02 {
    public static void main(String[] args) {
        GoodExample02 goodExample02 = new GoodExample02();
        goodExample02.someMethod();
    }
}
class BadExample02 {

    public void someMethod(){
        //function[1]
        //function[2]
        //function[3]
    }

}

/* ---------------------分割线---------------------- */

class GoodExample02 {

    public void someMethod(){
        function1();
        function2();
        function3();
    }

    private void function1(){
        //function[1]
    }

    private void function2(){
        //function[2]
    }

    private void function3(){
        //function[3]
    }

}
