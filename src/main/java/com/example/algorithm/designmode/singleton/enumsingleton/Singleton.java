package com.example.algorithm.designmode.singleton.enumsingleton;

/**
 * @author Jony-Liu
 * @date 2019/8/29 17:05
 */
public enum Singleton implements MySingleton {

    /**
     * 枚举类型字段
     */
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("complete singleton");
        }
    };

    public static MySingleton getInstance() {
        return Singleton.INSTANCE;
    }

}
