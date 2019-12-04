package com.example.algorithm.designmode.singleton.doublechecklock;

/**
 * @author Jony-Liu
 * @date 2019/12/4 22:20
 */
public class SafeDoubleCheckedLocking {

    private volatile static Instance instance;

    public static Instance getInstance() {
        if (null == instance) {
            synchronized
                    (SafeDoubleCheckedLocking.class) {
                if (null == instance) {
                    instance = new Instance();
                    //instance为volatile，现在没有问题了。
                }
            }
        }
        return instance;
    }
}
