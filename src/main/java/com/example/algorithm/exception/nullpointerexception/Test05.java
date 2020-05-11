package com.example.algorithm.exception.nullpointerexception;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * @author Jony-Liu
 * @date 2020/5/11 22:51
 */
public class Test05 {

    public static void main(String[] args) {
        Test05 test05 = new Test05();
        test05.testNullableArgument(null);
    }

    @NonNull
    private Object returnNonNull() {
        // 错误：returnNonNull() 可能返回空值，但其已声明为 @Nonnull
        return null;
    }

    @CheckForNull
    private Object returnNullable() {
        return null;
    }

    public void testReturnNullable() {
        Object obj = returnNullable();
        // 错误：方法的返回值可能为空
        System.out.println(obj.toString());
    }

    private void argumentNonNull(@NonNull Object arg) {
        System.out.println(arg.toString());
    }

    public void testArgumentNonNull() {
        // 错误：不能将 null 传递给非空参数
        argumentNonNull(null);
    }

    public void testNullableArgument(@CheckForNull Object arg) {
        // 错误：参数可能为空
        System.out.println(arg.toString());
    }
}
