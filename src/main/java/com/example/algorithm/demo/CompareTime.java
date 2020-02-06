package com.example.algorithm.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Jony-Liu
 */
public class CompareTime {

    public static void main(String[] args) {
        System.out.println(timeCompare(" 16:10:00"," 17:00:00"));
        System.out.println(timeCompare(" 14:05:00"," 14:05:59"));
    }

    /**
     * 判断当前时间是否在start与end之间
     * @param start
     * @param end
     * @return
     */
    public static boolean timeCompare(String start,String end){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String currDate = formatter.format(currentTime);
        String beginTime = currDate + start;
        String endTime = currDate + end;
        SimpleDateFormat formatterTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Calendar c3=Calendar.getInstance();
        try {
            c1.setTime(formatterTime.parse(beginTime));
            c2.setTime(formatterTime.parse(endTime));
            c3.setTime(formatterTime.parse(getCurrentTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if((c3.compareTo(c1)>0)&&c3.compareTo(c2)<0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * get current time
     * @return
     */
    public static String getCurrentTime(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
}
