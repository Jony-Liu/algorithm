package com.example.algorithm.exception;

/**
 * finally块不含返回值，但是做改变变量值的操作
 * @author Jony-Liu
 * @date 2020/6/3 21:08
 */
public class TryCatchTest5 {

    /**
     * 因为Java程序会把try或者catch块中的返回值保留，也就是暂时的确认了返回
     * 值，然后再去执行finally代码块中的语句
     * @return
     */
    private static int total() {
        int i = 0;
        try {
            System.out.println("执行try：" + i);
            return i;
        } finally {
            ++i;
            System.out.println("执行finally：" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }

}
