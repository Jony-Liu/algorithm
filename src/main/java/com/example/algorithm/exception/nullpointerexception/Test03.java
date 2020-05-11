package com.example.algorithm.exception.nullpointerexception;

import java.util.Collections;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2020/5/11 22:37
 * 如果函数的某个参数可以接收 null 值，考虑改写成两个函数，使用不同的函数签名，这样就可以强制要求每个参数都不为空了
 */
public class Test03 {

    public void methodA(Object arg1) {
        methodB(arg1, new Object[0]);
    }

    public void methodB(Object arg1, Object[] arg2) {
        for (Object obj : arg2) {} // no null check
    }

    // 支持泛型集合
    public <T> List<T> testReturnCollection() {
        return Collections.emptyList();
    }

}
