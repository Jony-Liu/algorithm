package com.example.algorithm.demo;

/**
 * @author Jony-Liu
 * @date 2019/10/8 21:49
 */
public class NumberOfDaffodils {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int hundred, ten, bits;
        System.out.println("水仙花数为：");
        for (int i = 100; i <= 999; i++)
        {
            hundred = i / 100;
            ten = i % 100 / 10;
            bits = i % 10;
            if (i == hundred * hundred * hundred + ten * ten * ten + bits * bits * bits)
            {
                System.out.print(i + "    ");
            }
        }
    }
}
