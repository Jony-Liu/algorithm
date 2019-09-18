package com.example.algorithm.designmode.memento;

/**
 * @author Jony-Liu
 * @date 2019/9/18 20:48
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento(){
        return this.memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }
}

