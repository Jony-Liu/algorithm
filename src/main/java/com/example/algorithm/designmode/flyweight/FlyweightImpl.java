package com.example.algorithm.designmode.flyweight;

/**
 * @author Jony-Liu
 * @date 2019/8/28 21:24
 */
public class FlyweightImpl  implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值："+arg);
    }
}
