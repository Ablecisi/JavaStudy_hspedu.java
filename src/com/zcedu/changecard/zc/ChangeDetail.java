package com.zcedu.changecard.zc;

import java.util.Scanner;

//类用于存储更改详情
public class ChangeDetail {
    //声明一个字符串变量用于存储详情
    private String detail;

    //构造函数
    public ChangeDetail() {
    }

    //构造函数设置详情
    public ChangeDetail(String detail) {
        this.detail = detail;
    }

    //获取详情的方法
    public String getDetail() {
        return detail;
    }

    //设置详情的方法
    public void setDetail(String detail) {
        this.detail = detail;
    }

    //显示详情的方法
    public void ShowDetail(){
        //声明一个布尔变量用于存储循环
        boolean loop = true;
        //循环直到用户输入一个空格
        do {
            //打印详情
            System.out.println(detail);
            //打印退出循环的消息
            System.out.println("                   输入空格退出                    ");
            //声明一个扫描器对象
            Scanner scan= new Scanner(System.in);
            //检查用户是否输入了一个空格
            if (scan.nextLine().equals(" ")) {
                //如果用户输入了一个空格，返回
                loop = false;
                //否则继续循环
            }
        }while (loop);
    }
}
