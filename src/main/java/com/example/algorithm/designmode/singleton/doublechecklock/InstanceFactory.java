package com.example.algorithm.designmode.singleton.doublechecklock;

/**
 * @author Jony-Liu
 * @date 2019/12/4 22:25
 */
public class InstanceFactory {

    private static class InstanceHolder {
        private static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return InstanceHolder.instance;
    }
}
