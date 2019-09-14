package com.example.algorithm.designmode.mediator;

/**
 * @author Jony-Liu
 * @date 2019/9/14 17:58
 */
public class ConcreteMediator extends Mediator {

    private ColleagueA ca;

    private ColleagueB cb;

    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if ("boss".equals(content)) {
            //老板来了, 通知员工A
            ca.action();
        }
        if ("client".equals(content)) {
            //客户来了, 通知前台B
            cb.action();
        }
    }
}

