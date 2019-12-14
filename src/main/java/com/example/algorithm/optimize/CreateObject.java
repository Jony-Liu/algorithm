package com.example.algorithm.optimize;

import org.junit.Test;

/**
 * @author Jony-Liu
 * @date 2019/12/14 19:07
 */
public class CreateObject {

    @Test
    public void test01() {
        int count = 10;
        for (int i = 1; i <= count; i++) {
            Object obj = new Object();
        }
    }

    @Test
    public void test02() {
        Object obj = null;
        int count = 10;
        for (int i = 0; i <= count; i++) {
            obj = new Object();
        }
    }
}
