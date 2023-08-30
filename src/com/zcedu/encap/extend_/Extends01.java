package com.zcedu.encap.extend_;

public class Extends01 {
    public static void main(String[] args){
        Graduate graduate = new Graduate();
        graduate.setScore(60);
        graduate.age = 19;
        graduate.name = "小明";
        graduate.testing();
        graduate.showInfo();

        Pupil pupil = new Pupil();
        pupil.age = 19;
        pupil.name = "xm";
        pupil.setScore(80);
        pupil.testing();
        pupil.showInfo();
    }


}
