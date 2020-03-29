package com.example.algorithm.multithread.chapter03.joinTest1;

/**
 * @author Jony-Liu
 * @date 2020/3/29 0:24
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        //Thread.sleep(?)
        System.out.println("我想threadTest对象执行完再执行");
        System.out.println("但是上面的代码中的sleep（）中的值应该写多少");
        System.out.println("答案是： 不确定");
    }
}
