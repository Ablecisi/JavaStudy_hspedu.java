package com.zcedu.encap.extend_;

public class Graduate{
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("大学生" + name + "正在考试...");
    }
    public void showInfo(){
        System.out.println("姓名：" + name + "年龄：" + age + "成绩：" + score);
    }
}
