package com.example.algorithm.lambda;

/**
 * @author Jony-Liu
 * @date 2019/9/3 21:24
 */
public class LambdaRunnable {

    public static int ii = 2;
    public static void main(String[] args) {
        new Runnable(){
            @Override
            public void run(){
                System.out.println("匿名内部类实现Runnable接口");
            }
        }.run();


        int i = 1;
        Runnable r=()->{
            System.out.println("lambda实现Runnable接口");
            System.out.println("i="+i); //测试是否可以使用方法内部变量  （匿名内部类只可以使用常量）
            //i++;   //报错
        };
        r.run();
    }
}
