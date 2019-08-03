package com.example.algorithm.thread;

class MyThreadWork1 extends Thread{

    public MyThreadWork1(String name){
        super(name);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //super.run();
        for(int i=0;i<200;i++){
            System.out.println(Thread.currentThread().getName()+"正在运行");
        }
    }
}

public class Work1 {
    public static void main(String[] args) {
        MyThreadWork1 m1 = new MyThreadWork1("进程1");
        MyThreadWork1 m2 = new MyThreadWork1("进程2");
        m1.setPriority(10);
        m2.setPriority(6);
        m1.start();
        m2.start();
    }
}
