package com.example.algorithm.multithread.chapter02.t9;

/**
 * @author jonyliu
 * @date 2020/1/20 17:02
 */
public class MyThread1 extends Thread{

    private MyOneList list;
    public MyThread1(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list, "A");
    }
}
