package com.example.algorithm.designmode.template;


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
        if (this.isAlarm()) {    //钩子方法
            this.alarm();
        }
        this.stop();
    }

}
