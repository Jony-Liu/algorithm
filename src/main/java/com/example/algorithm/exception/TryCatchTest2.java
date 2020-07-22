package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/5/31 15:48
 */
public class TryCatchTest2 {

    /**
     * 总结一下：不管是给try块中造了个异常，还是在try块中进行
     * return，我们发现finally块还是会执行的。因为异常处理设
     * 计初衷就是让finally块始终执行
     * @return
     */
    private static int total() {
        try {
            //极端情况
            System.out.println("执行try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("执行catch");
        } finally {
            System.out.println("执行finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }

}
