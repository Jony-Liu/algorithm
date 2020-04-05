package com.example.algorithm.multithread.chapter05.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * @author Jony-Liu
 * @date 2020/4/5 0:21
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("当前时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,-10);
        Date runDate = calendar.getTime();
        System.out.println("计划当前时间："+runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task,runDate);
    }
}
