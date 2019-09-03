package com.example.algorithm.designmode.bridge;

/**
 * @author Jony-Liu
 * @date 2019/9/3 15:30
 */
public class Man extends Person {

    public Man() {
        setType("男人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }

}
