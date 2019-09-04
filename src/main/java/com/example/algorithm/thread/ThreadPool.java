package com.example.algorithm.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jony-Liu
 */
public class ThreadPool {
    public static void main(String[] args) {
        System.out.println("计算机的核心数目：" + Runtime.getRuntime().availableProcessors());
        ExecutorService pool = Executors.newFixedThreadPool(6);
        int count = 10;
        Runnable target = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        /**
         * 在提交那一刻，只要线程池中有空余线程，就立即执行线程任务
         */
        //pool-1-thread-1
        pool.submit(target);
        //pool-1-thread-2
        pool.submit(target);
        //调用shutdown不再执行新任务，等执行完毕后,线程池中的进程死亡
        pool.shutdown();
    }

}
