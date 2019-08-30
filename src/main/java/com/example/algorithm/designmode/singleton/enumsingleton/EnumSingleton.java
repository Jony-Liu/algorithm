package com.example.algorithm.designmode.singleton.enumsingleton;

/**
 * @author Jony-Liu
 * @date 2019/8/29 17:10
 */
public class EnumSingleton {

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    /**
     * 内部枚举类形式 构造方法中实例化对象
     */
    private enum Singleton {
        /**
         * 枚举类型字段
         */
        INSTANCE;
        /**
         * 唯一对象实例
         */
        private EnumSingleton singleton;

        /**
         * JVM会保证此方法绝对只调用一次
         */
        Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }
}
