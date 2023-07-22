package com.aseem.day2;

public class TemperatureConversion {
    public static void main(String[] args) {
        double tempInCelsius = 24.0;

        double tempInFahrenheit = (tempInCelsius * 9 / 5) + 32;

        System.out.println(tempInCelsius + "C is equal to " + tempInFahrenheit + "F");
    }
}
