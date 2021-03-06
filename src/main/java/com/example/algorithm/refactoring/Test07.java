package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/18 22:10
 * 提取类或继承体系中的常量
 */
public class Test07 {

    public static void main(String[] args) {
        BadExample07 badExample07 = new BadExample07();
        badExample07.someMethod1();
        badExample07.someMethod2();
        badExample07.someMethod3();

        GoodExample07 goodExample07 = new GoodExample07();
        goodExample07.someMethod1();
        goodExample07.someMethod2();
        goodExample07.someMethod3();

    }


}

class BadExample07 {

    public void someMethod1(){
        send("您的操作已成功！");
    }

    public void someMethod2(){
        send("您的操作已成功！");
    }

    public void someMethod3(){
        send("您的操作已成功！");
    }

    private void send(String message){
        //code
    }
}

/* ---------------------分割线---------------------- */

class GoodExample07 {

    protected static final String SUCCESS_MESSAGE = "您的操作已成功！";

    public void someMethod1(){
        send(SUCCESS_MESSAGE);
    }

    public void someMethod2(){
        send(SUCCESS_MESSAGE);
    }

    public void someMethod3(){
        send(SUCCESS_MESSAGE);
    }

    private void send(String message){
        //code
    }

}