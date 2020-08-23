package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/11 22:41
 * 嵌套条件分支的优化（2）
 */
public class Test04 {
    public static void main(String[] args) {
        BadExample04 badExample04 = new BadExample04();
        badExample04.someMethod(new Object(),new Object());
        GoodExample04 goodExample04 = new GoodExample04();
        goodExample04.someMethod(new Object(),new Object());
    }
}
class BadExample04 {

    public void someMethod(Object A,Object B){
        if (A != null) {
            if (B != null) {
                //code
            }
        }
    }

}

/* ---------------------分割线---------------------- */

class GoodExample04 {

    /**
     * 将条件分支合并，以此来达到代码清晰的目的
     * @param A
     * @param B
     */
    public void someMethod(Object A,Object B){
        if (A != null && B != null) {
            //code
        }
    }

}