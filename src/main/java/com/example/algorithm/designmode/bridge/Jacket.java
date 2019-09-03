package com.example.algorithm.designmode.bridge;

/**
 * @author Jony-Liu
 * @date 2019/9/3 15:32
 */
public class Jacket extends Clothing {

    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿马甲");
    }
}
