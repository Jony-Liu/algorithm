package com.example.algorithm.hutool.date;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author Jony-Liu
 * @date 2020/9/5 16:54
 * 格式化日期输出
 */
public class Demo03 {

    public static void main(String[] args) {
        String dateStr = "2017-03-01";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);

        //结果 2017/03/01
        String format = DateUtil.format(date, "yyyy/MM/dd");
        System.out.println(format);

        //常用格式的格式化，结果：2017-03-01
        String formatDate = DateUtil.formatDate(date);
        System.out.println(formatDate);

        //结果：2017-03-01 00:00:00
        String formatDateTime = DateUtil.formatDateTime(date);
        System.out.println(formatDateTime);

        //结果：00:00:00
        String formatTime = DateUtil.formatTime(date);
        System.out.println(formatTime);
    }

}
