package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/30 21:25
 */
public class SuspendResumeNoSameDemo {
    private String username = "1";
    private String password = "11";
    public  void setValue(String u,String password){
        this.username = u;
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("stop a thread");
            Thread.currentThread().suspend();
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        this.password = password;
    }

    public void printUserAndPassWord(){
        System.out.println(username + ":" +password);
    }
}
