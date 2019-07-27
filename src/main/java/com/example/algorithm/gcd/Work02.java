package com.example.algorithm.gcd;

import java.util.Scanner;

public class Work02 {
    //greatest common divisor
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//4
        int b = in.nextInt();//12
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
        in.close();
    }
}
