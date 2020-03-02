package com.example.algorithm.multithread.chapter02.lockObjectChange;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Jony-Liu
 * @date: 2020/3/2 21:45
 */
public class MyService {
    private String lock = "123";
    public void testMethod(){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + " begin"+ System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
