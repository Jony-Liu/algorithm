package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:08
 */
public class HasSelfPrivateNumThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;
    public HasSelfPrivateNumThreadB(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("b");
    }
}
