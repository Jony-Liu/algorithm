package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/11 22:41
 */
public class Test04 {
    public static void main(String[] args) {
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

    public void someMethod(Object A,Object B){
        if (A != null && B != null) {
            //code
        }
    }

}