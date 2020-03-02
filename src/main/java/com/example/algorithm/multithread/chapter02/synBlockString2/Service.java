package com.example.algorithm.multithread.chapter02.synBlockString2;

/**
 * @author Jony-Liu
 * @date 2020/1/20 17:27
 */
public class Service {
    private String anyString = new String();

    public void a(){
        try{
            //synchronized(非this对象)与synchronized 方法是异步调用的效果
            synchronized (anyString){
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }

}
