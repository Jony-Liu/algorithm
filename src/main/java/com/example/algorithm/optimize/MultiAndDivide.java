package com.example.algorithm.optimize;

import org.junit.Test;

/**
 * @author Jony-Liu
 * @date 2019/12/13 9:11
 */
public class MultiAndDivide {

    @Test
    public void test() {
        int val;
        int a = 0;
        int b = 0;
        for (val = 0; val < 100000; val += 5) {
            a = val * 8;
            b = val / 2;
        }
        System.out.println(a);
        System.out.println(b);
    }
    @Test
    public void test01() {
        int val;
        int a = 0;
        int b = 0;
        for (val = 0; val < 100000; val += 5) {
            a = val << 3;
            b = val >> 1;
        }
        System.out.println(a);
        System.out.println(b);
    }

}
