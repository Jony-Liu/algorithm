package com.example.algorithm.designmode.mediator;

/**
 * @author Jony-Liu
 * @date 2019/9/14 17:58
 */
public abstract class Mediator {
    /**
     * send a message
     * @param content
     */
    public abstract void notice(String content);
}

