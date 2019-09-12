package com.example.algorithm.designmode.template;

/**
 * @author Jony-Liu
 */
public abstract class HanmaModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected boolean isAlarm() {
        return false;
    }

    final public void run() {
        this.start();
        this.engineBoom();
        //钩子方法
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

}
