package com.example.algorithm.hutool.date;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author Jony-Liu
 * @date 2020/9/2 22:13
 * 字符串转日期
 */
public class Demo02 {

    public static void main(String[] args) {
        String dateStr = "2017-03-01";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
        String dateStr02 = "2017-03-01";
        Date date02 = DateUtil.parse(dateStr02, "yyyy-MM-dd");
        System.out.println(date02);
    }

}
