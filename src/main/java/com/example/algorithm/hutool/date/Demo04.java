package com.example.algorithm.hutool.date;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

import java.util.Date;

/**
 * @author Jony-Liu
 * @date 2020/9/5 17:00
 * 获取Date对象的某个部分
 */
public class Demo04 {

    public static void main(String[] args) {
        Date date = DateUtil.date();
        System.out.println(date);
        //获得年的部分
        int year = DateUtil.year(date);
        System.out.println(year);
        //获得月份，从0开始计数
        int month = DateUtil.month(date);
        System.out.println(month);
        //获得月份枚举
        Month month1 = DateUtil.monthEnum(date);
        System.out.println(month1);
    }

}
