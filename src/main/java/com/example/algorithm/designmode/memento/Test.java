package com.example.algorithm.designmode.memento;

/**
 * @author Jony-Liu
 * @date 2019/9/18 20:49
 */
public class Test {

    public static void main(String[] args) {
        Originator org = new Originator();
        org.setState("开会中");

        Caretaker ctk = new Caretaker();
        //将数据封装在Caretaker
        ctk.setMemento(org.createMemento());

        org.setState("睡觉中");
        org.showState();//显示

        //将数据重新导入
        org.setMemento(ctk.getMemento());
        org.showState();
    }
}
