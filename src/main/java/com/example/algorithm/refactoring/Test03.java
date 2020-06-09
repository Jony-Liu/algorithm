package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/9 21:54
 */
public class Test03 {
    class BadExample {

        public void someMethod(Object A,Object B){
            if (A != null) {
                if (B != null) {
                    //code[1]
                }else {
                    //code[3]
                }
            }else {
                //code[2]
            }
        }

    }

    /* ---------------------分割线---------------------- */

    class GoodExample {

        public void someMethod(Object A,Object B){
            if (A == null) {
                //code[2]
                return;
            }
            if (B == null) {
                //code[3]
                return;
            }
            //code[1]
        }

    }
}
