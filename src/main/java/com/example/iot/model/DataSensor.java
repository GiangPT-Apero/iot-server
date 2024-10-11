package com.example.iot.model;

public class DataSensor {
    private int temp;
    private int hum;
    private int light;

    public DataSensor(int temp, int hum, int light) {
        this.temp = temp;
        this.hum = hum;
        this.light = light;
    }
}
