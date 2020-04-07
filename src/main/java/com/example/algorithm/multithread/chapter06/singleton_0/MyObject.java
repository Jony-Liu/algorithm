package com.example.algorithm.multithread.chapter06.singleton_0;

/**
 * @author Jony-Liu
 * @date 2020/4/5 18:35
 */
public class MyObject {
    /**
     * 饿汉式单例模式，可以保证多个线程下的唯一实例，getInstance方法性能较高，但是无法进行懒加载
     * 类加载的时候单例对象就产生了，如果类成员占有的资源比较多，这种方法较为不妥
     */
    private static MyObject myObject = new MyObject();
    private MyObject(){
    }
    public static MyObject getInstance(){
        //此代码版本为立即加载
        //此版本代码的缺点是不能有其他实例变量
        // TODO: 2020/4/5  以下描述待矫正
        //因为getInstance()方法没有同步 待矫正
        //所以有可能出现线程安全问题
        return myObject;
    }
}
