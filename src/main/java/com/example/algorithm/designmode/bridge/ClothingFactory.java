package com.example.algorithm.designmode.bridge;

/**
 * @author Jony-Liu
 * @date 2019/9/3 15:39
 */
public class ClothingFactory {

    public static Clothing getClothing(){
        return new Jacket();
    }

}
