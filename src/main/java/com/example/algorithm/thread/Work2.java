package com.example.algorithm.thread;

import java.util.Random;

/**
 * @author Jony-Liu
 */
class SubThread extends Thread{

    public SubThread(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"循环第"+i+"次");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"循环结束！");
    }

}

/**
 * @author Jony-Liu
 */
public class Work2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubThread s1 = new SubThread("First");
        SubThread s2 = new SubThread("Second");
        SubThread s3 = new SubThread("Third");
        s1.start();
        s2.start();
        s3.start();
    }

}
