package com.aseem.day2;

public class CurrencyConverter {
    private static final float CONVERSION_RATE = 99.91f;
    public static void main(String[] args) {
        int usd = 10;
        float npr = usd * CONVERSION_RATE;

        System.out.println(usd + " USD equals to " + npr + " NPR");
    }
}
