package com.example.algorithm.designmode.memento;

/**
 * @author Jony-Liu
 * @date 2019/9/18 20:46
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
