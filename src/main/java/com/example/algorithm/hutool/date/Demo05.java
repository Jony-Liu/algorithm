package com.example.algorithm.hutool.date;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author Jony-Liu
 * @date 2020/9/5 17:06
 * 开始和结束时间
 */
public class Demo05 {

    public static void main(String[] args) {
        String dateStr = "2017-03-01 22:33:23";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
        //一天的开始，结果：2017-03-01 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(date);
        System.out.println(beginOfDay);
        //一天的结束，结果：2017-03-01 23:59:59
        Date endOfDay = DateUtil.endOfDay(date);
        System.out.println(endOfDay);
    }

}
