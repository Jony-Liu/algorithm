package com.example.algorithm.multithread.chapter05.timerTest1;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Jony-Liu
 * @date 2020/4/5 0:19
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行了，时间为："+new Date());
    }

}
