package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:12
 */
public class HasSelfPrivateNumTest {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNumThreadA hasSelfPrivateNumThreadA = new HasSelfPrivateNumThreadA(hasSelfPrivateNum);
        hasSelfPrivateNumThreadA.start();
        HasSelfPrivateNumThreadB hasSelfPrivateNumThreadB = new HasSelfPrivateNumThreadB(hasSelfPrivateNum);
        hasSelfPrivateNumThreadB.start();
    }
}
