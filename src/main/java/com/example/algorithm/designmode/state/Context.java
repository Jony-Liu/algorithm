package com.example.algorithm.designmode.state;

/**
 * @author Jony-Liu
 * @date 2019/9/19 20:03
 */
public class Context {

    private Weather weather;

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return this.weather;
    }

    public String weatherMessage() {
        return weather.getWeather();
    }
}
