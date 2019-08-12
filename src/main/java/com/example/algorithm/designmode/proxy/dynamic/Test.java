package com.example.algorithm.designmode.proxy.dynamic;

import com.example.algorithm.designmode.proxy.AdidasFactory;
import com.example.algorithm.designmode.proxy.Factory;
import com.example.algorithm.designmode.proxy.NikeFactory;

public class Test {

    public static void main(String[] args) {
        AdidasFactory adidas = new AdidasFactory();
        NikeFactory nike = new NikeFactory();
        MyInvokeHandler mi = new MyInvokeHandler();
        Object obj = mi.blink(adidas);
        Factory f1 = (Factory) obj;
        f1.clothProduct();
        System.out.println("-------------");
        obj = mi.blink(nike);
        f1 = (Factory) obj;
        f1.clothProduct();
        System.out.println("-------------");
        ClassLoader classLoader = mi.getClass().getClassLoader();
        System.out.println(classLoader);
        System.out.println(NikeFactory.class.getClassLoader());
    }

}
