package com.example.algorithm.exception.nullpointerexception;
//import org.checkerframework.checker.nullness.qual.Nullable;
/**
 * @author Jony-Liu
 * @date 2020/5/11 23:02
 */
public class Test06 {


    //@Nullable
    private Object returnNullable() {
        return null;
    }

    public void testReturnNullable() {
        Object obj = returnNullable();
        // 错误：obj 可能为空
        System.out.println(obj.toString());
    }
}
