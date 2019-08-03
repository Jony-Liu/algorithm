package com.example.algorithm.thread;


class joinDemo implements Runnable{

    private Thread thread;

    public joinDemo() {
        // TODO Auto-generated constructor stub
    }

    public joinDemo(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        if(thread != null){
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}

public class ThreadTest2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        joinDemo j1= new joinDemo();
        Thread t1 = new Thread(j1,"thread1");
        t1.start();
        joinDemo j2 = new joinDemo(t1);
        Thread t2 = new Thread(j2,"thread2");
        t2.start();
    }

}
