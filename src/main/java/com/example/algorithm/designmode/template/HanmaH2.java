package com.example.algorithm.designmode.template;


public class HanmaH2 extends HanmaModel {

    private boolean alarmFlag;

    public void setAlarm(boolean b) {
        alarmFlag = b;
    }

    @Override
    protected boolean isAlarm() {
        // TODO Auto-generated method stub
        return this.alarmFlag;
    }

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2启动...");


    }

    @Override
    protected void stop() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2停止...");

    }

    @Override
    protected void alarm() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2鸣笛...");

    }

    @Override
    protected void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2嘟嘟嘟...");

    }

}

