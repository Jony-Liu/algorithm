package com.example.algorithm.hutool.date;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Jony-Liu
 * @date 2020/9/1 22:28
 */
public class Demo01 {

    public static void main(String[] args) {
        //当前时间
        Date date = DateUtil.date();
        System.out.println(date);
        //当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());
        System.out.println(date2);
        //当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());
        System.out.println(date3);
        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        System.out.println(now);
        //当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();
        System.out.println(today);
    }

}
