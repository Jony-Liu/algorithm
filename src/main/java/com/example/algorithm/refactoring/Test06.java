package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/16 22:04
 */
public class Test06 {

    public static void main(String[] args) {
        BadExample06 badExample06 = new BadExample06();
        badExample06.someMethod(1, 2, 3, 4, 5,6);
        GoodExample06 goodExample06 = new GoodExample06();
        goodExample06.someMethod(new Data());
    }

}
class BadExample06 {

    public void someMethod(int i,int j,int k,int l,int m,int n){
        //code
    }

}

/* ---------------------分割线---------------------- */

class GoodExample06 {

    public void someMethod(Data data){
        //code
    }

}

class Data{

    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;


}
