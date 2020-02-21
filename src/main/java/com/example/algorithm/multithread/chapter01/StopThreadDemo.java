package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/26 21:48
 */
public class StopThreadDemo extends Thread  {
    @Override
    public void run() {
        try{
            for (int i = 0; i <500000 ; i++) {
                if(this.isInterrupted()){
                    System.out.println("已经停止状态，我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
        }catch (InterruptedException e){
            System.out.println("进入StopThreadDemo 的 catch");
            e.printStackTrace();
        }
    }
}
