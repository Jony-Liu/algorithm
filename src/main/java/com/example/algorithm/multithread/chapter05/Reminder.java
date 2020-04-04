package com.example.algorithm.multithread.chapter05;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Jony-Liu
 * @date 2020/4/4 23:58
 */
public class Reminder {
    private int count = 0;
    Timer timer;
    public Reminder() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
                           @Override
                           public void run() {
                               System.out.println(System.currentTimeMillis());
                               if(count==3){
                                   System.out.println("cancel");
                                   timer.cancel();
                               }else{
                                   System.out.println("go on");
                               }
                               count++;
                           }
                       },1000,3000
        );
    }
}
