package com.example.algorithm.demo;

/**
 * @author Jony-Liu
 * @date 2019/10/2 21:34
 */
class Outer {

    static int x;

    static class Inner
    {
        void test()
        {
            System.out.println(x);
        }
    }
}
