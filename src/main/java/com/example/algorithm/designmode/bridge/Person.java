package com.example.algorithm.designmode.bridge;

/**
 * @author Jony-Liu
 * @date 2019/9/3 15:29
 */
public abstract class Person {

    private Clothing clothing;

    private String type;

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing() {
        this.clothing = ClothingFactory.getClothing();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public abstract void dress();

}
