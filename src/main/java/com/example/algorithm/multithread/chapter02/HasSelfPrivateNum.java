package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:03
 */
public class HasSelfPrivateNum {
    private int num = 0;
    synchronized public void addI(String username){
        try{
            if("a".equals(username)){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over");
            }
            System.out.println( username + " num  = "+num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
