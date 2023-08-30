package com.zcedu.homework;

public class homework04 {
    public static void main(String[] args){
        System.out.println(method(method(10, 20),100));
    }

    public static double method(double args1, double args2){
        return args1 + args2;
    }
}

