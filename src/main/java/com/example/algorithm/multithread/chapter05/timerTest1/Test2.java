package com.example.algorithm.multithread.chapter05.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author Jony-Liu
 * @date 2020/4/5 0:21
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("当前时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runDate = calendar.getTime();
        MyTask task = new MyTask();
        //设置守护线程
        Timer timer = new Timer(true);
        timer.schedule(task,runDate);
    }
}
