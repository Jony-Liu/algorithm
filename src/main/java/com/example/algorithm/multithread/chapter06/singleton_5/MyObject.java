package com.example.algorithm.multithread.chapter06.singleton_5;

/**
 * @author Jony-Liu
 * @date 2020/4/5 18:35
 */
public class MyObject {
    //volatile 防止JIT重排序
    private volatile static MyObject myObject;

    private MyObject() {

    }

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                //模拟在创建线程之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if(myObject==null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
