package com.example.algorithm.multithread.chapter01;

/**
 * @author jonyliu
 * @date 2019/12/23 9:09
 */
public class CountOperateTest {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();
    }
}
