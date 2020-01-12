package com.example.algorithm.multithread.chapter02;

public class Main {
    public int i = 10;
    synchronized public void operateIMainMethod(){
        try{
                i--;
            System.out.println("main print i = "+i);
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
