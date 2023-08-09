package com.aseem.week3.day5;

public class Alarm {
    public static void main(String[] args) {
        System.out.println(alarmClock(0, true));
    }
    public static String alarmClock(int day, boolean vacation) {
        if(!vacation){
            if(day==0 || day==6){
                return "10:00";
            }
            else {
                return "7:00";
            }
        }else{
            if(day==0 || day==6){
                return "off";
            }
            else {
                return "10:00";
            }
        }
    }
}
