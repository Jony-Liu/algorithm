package com.example.algorithm.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        System.out.println("计算机的核心数目：" + Runtime.getRuntime().availableProcessors());
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Runnable target = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        /**
         * 在提交那一刻，只要线程池中有空余线程，就立即执行线程任务
         */
        pool.submit(target);//pool-1-thread-1
        pool.submit(target);//pool-1-thread-2
        pool.shutdown();//调用shutdown不再执行新任务，等执行完毕后,线程池中的进程死亡
    }

}
