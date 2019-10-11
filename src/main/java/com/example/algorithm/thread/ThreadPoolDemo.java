package com.example.algorithm.thread;

import java.util.concurrent.*;

/**
 * @author Jony-Liu
 * @date 2019/10/10 21:24
 */
public class ThreadPoolDemo {

    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    public static ExecutorService newWorkStealingPool(int parallelism) {
        return new ForkJoinPool
                (parallelism,
                        ForkJoinPool.defaultForkJoinWorkerThreadFactory,
                        null, true);
    }

    /**
     * @return FinalizableDelegatedExecutorService
     */
    public static ExecutorService newCachedThreadPool() {
        return Executors.newSingleThreadExecutor();
    }

    public static ExecutorService newSingleThreadExecutor() {
        return new ThreadPoolExecutor(1, 1,
                        0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>());
    }

    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
        return new ScheduledThreadPoolExecutor(corePoolSize);
    }

}
