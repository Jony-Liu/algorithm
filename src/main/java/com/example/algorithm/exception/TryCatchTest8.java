package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/6/3 21:09
 */
public class TryCatchTest8 {

    /**
     * TryCatchTest6,TryCatchTest7,TryCatchTest8中说明了一点，在分析含有finally块的方法返回值时，要对于return出现的地方进行
     * 具体分析。在finally块中进行return操作的话，则方法整体的返回值就是finally块中的return返回值。如果在finally块之后的方法
     * 内return，则return的值就是进行完上面的操作后的return值。
     * @return
     */
    private static int total() {
        int i = 1;
        try {
            System.out.println("执行try：" + i);
        } finally {
            ++i;
            System.out.println("执行finally：" + i);
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }

}
