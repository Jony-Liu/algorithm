package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/18 22:10
 */
public class Test07 {


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