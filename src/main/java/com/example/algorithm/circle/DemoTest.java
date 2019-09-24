package com.example.algorithm.circle;

import org.junit.Test;

/**
 * @author Jony-Liu
 */
public class DemoTest {

    @Test
    public void test03() {
        int[] a = {2, 5, 7, 3, 6};
        //for-each循环，写法简洁，但不能用下标动态的访问数组
        for (int k : a) {
            System.out.print(k + " ");
        }
    }

    @Test
    public void test02() {
        int count = 0;
        int[] a = {2};
        do {
            System.out.print(a[count] + " ");
        } while (count++ < a.length-1);
    }

    @Test
    public void test01() {
        int count = 0;
        int[] a = {2, 5, 7, 3, 6};
        while (count < a.length) {
            System.out.print(a[count] + " ");
            count++;
        }

    }
}
