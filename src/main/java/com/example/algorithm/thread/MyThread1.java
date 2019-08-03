package com.example.algorithm.thread;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //输出奇数
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println("MyThread1---"+i);
            }
        }
    }

}


