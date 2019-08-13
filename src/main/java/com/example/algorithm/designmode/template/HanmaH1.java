package com.example.algorithm.designmode.template;


public class HanmaH1 extends HanmaModel {

    @Override
    protected boolean isAlarm() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1启动...");
    }

    @Override
    protected void stop() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1停止...");

    }

    @Override
    protected void alarm() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1嘟嘟嘟...");

    }

}
