package com.example.algorithm.designmode.command;


public class CommandTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ProcessArray p = new ProcessArray();
        int[] i = {1, 2, 3, 4, 5};
        p.process(i, new PrintCommand());
        p.process(i, new AddCommand());
        //以下是使用了Lambda表达式
        p.process(i, (int[] target) -> {
                    int sum = 0;
                    for (int k : target) {
                        sum += k;
                    }
                    System.out.println("数组元素的总和：" + sum);
                }
        );

    }

}

