package com.example.algorithm.thread;

import java.util.concurrent.*;

/**
 * @author Jony-Liu
 * @date 2019/10/10 21:24
 */
public class ThreadPoolDemo {

    /**
     * 1.创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     *
     * @param nThreads
     * @return
     */
    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    /**
     * 2.(JDK8新增)会根据所需的并发数来动态创建和关闭线程。能够合理的使用CPU进行对
     * 任务进行并发操作，所以适合使用在很耗时的任务。
     *
     * @param parallelism
     * @return
     */
    public static ExecutorService newWorkStealingPool(int parallelism) {
        return new ForkJoinPool
                (parallelism,
                        ForkJoinPool.defaultForkJoinWorkerThreadFactory,
                        null, true);
    }

    /**
     * 3.创建一个可缓存的线程池,可灵活回收空闲线程，若无可回收，则新建线程。
     *
     * @return
     */
    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }

    /**
     * 4.创建一个单线程的线程池。
     *
     * @return FinalizableDelegatedExecutorService
     */
    public static ExecutorService newSingleThreadExecutor() {
        return Executors.newSingleThreadExecutor();
    }

    /**
     * 5.创建一个定长线程池，支持定时及周期性任务执行。
     *
     * @param corePoolSize
     * @return
     */
    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
        return new ScheduledThreadPoolExecutor(corePoolSize);
    }

}
