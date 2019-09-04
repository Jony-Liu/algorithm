package com.example.algorithm.lambda;

/**
 * @author Jony-Liu
 * @date 2019/9/3 21:29
 */
public class LambdaInterface {
    public static void main(String[] args) {
        new Message() {

            @Override
            public void message(String msg) {
                System.out.println(msg);   //打印传参 msg
            }
        }.message("用匿名内部类调用自定义的接口");

        Message m = (String msg) -> {
            System.out.println(msg);
        };
        m.message("lambda 调用自定义接口");
    }

    static interface Message {
        void message(String msg);
    }
}
