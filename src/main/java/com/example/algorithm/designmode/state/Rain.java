package com.example.algorithm.designmode.state;

/**
 * @author Jony-Liu
 * @date 2019/9/19 20:05
 */
public class Rain implements Weather {

    @Override
    public String getWeather() {
        return "下雨";
    }
}

