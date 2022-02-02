package com.cgi.fantest;

public class DriverClass {
    public static void main(String[] args){
        CeilingFan fan = new CeilingFan();
        System.out.println(fan);
        for (int i = 0; i < 5; i++){
            fan.changeSpeed();
            System.out.println(fan);
        }

        fan.changeDirection();
        for (int i = 0; i < 5; i++){
            fan.changeSpeed();
            System.out.println(fan);
        }
    }
}
