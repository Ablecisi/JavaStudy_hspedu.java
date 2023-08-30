package com.zcedu.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // 匿名内部类(基于接口)
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());

        // 匿名内部类(基于具体类，参数 )
        AA aa = new AA("jack") {
            @Override
            public void printName() {
                System.out.println("hhh");
                System.out.println(getName());
            }
        };
        aa.printName();

        //匿名内部类(基于抽象类,参数)
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };






    }
}

