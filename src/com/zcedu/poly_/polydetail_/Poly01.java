package com.zcedu.poly_.polydetail_;

public class Poly01 {
    public static void main(String[] args){
        Master tom = new Master("汤姆");
        Animal dog = new Dog("大黄");
        Food bone = new Bone("大棒骨");
        tom.feed(dog , bone);
        Animal x = new Animal("x");
        System.out.println(x instanceof Dog);
    }

}
