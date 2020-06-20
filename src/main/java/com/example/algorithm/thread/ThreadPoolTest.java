package com.example.algorithm.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author Jony-Liu
 */
public class ThreadPoolTest {

    @Test
    public void test03() {
     /*   ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024),
                namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        pool.execute(() -> System.out.println(Thread.currentThread().getName()));
        //grateful shutdown
        pool.shutdown();*/
    }

    @Test
    public void test02() {
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
                new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
        Runnable target = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        executorService.submit(target);
        executorService.submit(target);
        executorService.shutdown();
    }

    @Test
    public void test01() {
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
