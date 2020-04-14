package com.example.algorithm.multithread.chapter06.singleton_7_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author Jony-Liu
 * @date 2020/4/5 21:44
 */
public class MyObject  implements Serializable{
    private static final long serialVersionUID = 888L;
    private static class MyObjectHandler{
        private static final MyObject myObject = new MyObject();
    }

    private MyObject(){
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException{
        System.out.println("调用了readResolve");
        return MyObjectHandler.myObject;
    }

}
