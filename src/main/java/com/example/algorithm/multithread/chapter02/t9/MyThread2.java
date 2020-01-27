package com.example.algorithm.multithread.chapter02.t9;

/**
 * @author jonyliu
 * @date 2020/1/20 17:04
 */
public class MyThread2  extends Thread{

    private MyOneList list;
    public MyThread2(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list, "B");
    }
}
