package com.zcedu.changecard.zc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//类用于存储收入详细信息
public class IncomeRecorded {
    //声明变量以存储余额、钱和日期
    private double balance;
    private double money;
    private Date date;
    //声明变量以存储名称和收入类型
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        switch (name.length()) {
            case 0 -> this.name = "无";
            case 1 -> this.name = String.format("%s   ", name);
            case 2 -> this.name = String.format("%s  ", name);
            case 3 -> this.name = String.format("%s ", name);
            case 4 -> this.name = String.format("%s", name);
            default -> this.name = name;
        }
    }

    //获取余额的方法
    public double getBalance() {
        return balance;
    }

    //设置余额的方法
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //获取钱的方法
    public double getMoney() {
        return money;
    }

    //设置钱的方法
    public void setMoney(double money) {
        //检查 money 是否大于等于 0
        boolean loop = true;
        do {

            if ( money >= 0 ) {
                //如果满足条件，将余额设置为当前余额加上 money
                setBalance(getBalance() + money);
                //设置 money 为 money
                this.money = money;
                //设置 loop1 为 false，结束循环
                loop = false;
            }else {
                System.out.println("输入的金额不能为负数!");
                //如果金额小于 0，则输出错误信息
                Scanner scan = new Scanner(System.in);
                System.out.println("请重新输入金额:");
                //提示用户输入金额
                money = scan.nextDouble();
                //再次获取金额
            }
        }while (loop);
        //如果金额大于等于 0，则继续循环
    }public void setMoney(String name, double  money ){
        //检查 money 是否大于等于 0
        name = getName();
        boolean loop = true;
        do {

            if ( money >= 0 && money <= balance ) {
                //如果满足条件，将余额设置为当前余额减去 money
                setBalance(getBalance() - money);
                //设置 money 为 money
                this.money = money;
                //设置 loop1 为 false，结束循环
                loop = false;
            }else {
                System.out.println("输入的金额不能为负数!或余额不足");
                //如果金额小于 0，则输出错误信息
                Scanner scan = new Scanner(System.in);
                System.out.println("请重新输入金额:");
                //提示用户输入金额
                money = scan.nextDouble();
                //再次获取金额
            }
        }while (loop);
        //如果金额大于等于 0，则继续循环
    }

    //获取日期的方法
    public Date getDate() {
        return date;
    }

    //设置日期的方法
    public void setDate() {
        //设置日期为当前日期
        this.date = new Date();
    }


    //将日期转换为中文格式的方法
    public String getCh_zhDate(Date date) {
        //创建一个 SimpleDateFormat 对象，用于格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //返回格式化后的日期
        return sdf.format(date);
    }


    public void ShowInfo(){
        //显示收入记录
        //显示详细信息
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("本次收入为："+getMoney()+"元");
        System.out.println("本次收入时间："+getCh_zhDate(getDate()));
        System.out.println("当前余额为："+getBalance()+"元");
        System.out.println("------------------------------------------------------------------------------------\n");
    }public void ShowInfo(String name){
        //显示收入记录
        //显示详细信息
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("本次消费对象为："+getName());
        System.out.println("本次消费为："+getMoney()+"元");
        System.out.println("本次消费时间："+getCh_zhDate(getDate()));
        System.out.println("当前余额为："+getBalance()+"元");
        System.out.println("------------------------------------------------------------------------------------\n");
    }

    //显示收入详细信息的方法
    public void ShowIncome(ChangeDetail detail){
        //设置日期
        setDate();
        //检查 money 是否大于等于 0
        if (money >= 0) {
            //如果满足条件，将 money 添加到详细信息中
            detail.setDetail(detail.getDetail() + "\n收益入账" + "\t+" + getMoney() + "\t" + getCh_zhDate(getDate()) + "\t余额：" + getBalance());
        }
        //显示收入详细信息
    }public void ShowIncome(ChangeDetail detail ,String name){
        //设置日期
        setDate();
        //检查 money 是否大于等于 0
        if (money >= 0) {
            //如果满足条件，将 money 添加到详细信息中
            detail.setDetail(detail.getDetail() + "\n" + getName() +"\t-" + getMoney() + "\t" + getCh_zhDate(getDate()) + "\t余额：" + getBalance());
        }
        //显示收入详细信息
    }

}
