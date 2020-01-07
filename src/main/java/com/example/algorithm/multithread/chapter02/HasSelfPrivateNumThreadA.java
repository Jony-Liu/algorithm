package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:06
 */
public class HasSelfPrivateNumThreadA  extends Thread{
    private HasSelfPrivateNum hasSelfPrivateNum;
    public HasSelfPrivateNumThreadA(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("a");
    }
}
