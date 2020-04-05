package com.example.algorithm.multithread.chapter05;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Jony-Liu
 * @date 2020/4/5 2:00
 */
public class Test9 {

    static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("begin timer="+ new Date());
            System.out.println("end timer="+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        System.out.println("现在执行时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-20);
        Date runDate = calendar.getTime();
        System.out.println("计划执行时间"+runDate);
        Timer timer = new Timer();
        //schedule不具备追赶执行性
        //timer.schedule(task, runDate, 2000);
        //scheduleAtFixedRate具备追赶性
        timer.scheduleAtFixedRate(task,runDate,2000);

    }
}
