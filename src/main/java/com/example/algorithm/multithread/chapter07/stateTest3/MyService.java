package com.example.algorithm.multithread.chapter07.stateTest3;

/**
 * 验证 BLOCKED
 * @author Jony-Liu
 * @date 2020/4/6 1:04
 */
public class MyService {
    synchronized static public void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "进入了业务方法！状态；" + Thread.currentThread().getState());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
