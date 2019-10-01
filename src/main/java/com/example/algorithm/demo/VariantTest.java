package com.example.algorithm.demo;

/**
 * @author Jony-Liu
 * @date 2019/10/1 12:33
 */
public class VariantTest {
    public static int staticVar = 0;

    public int instanceVar = 0;

    public VariantTest() {

        staticVar++;

        instanceVar++;

        System.out.println("staticVar:" + staticVar + " instanceVar:" + instanceVar);

    }

    public static void main(String[] args) {
        VariantTest variantTest = new VariantTest();
        VariantTest variantTest1 = new VariantTest();
    }
}
