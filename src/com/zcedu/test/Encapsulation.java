
package com.zcedu.test;

public class Encapsulation {
    private String name;
    private double balance;
    private String password;

    public Encapsulation() {
    }

    public Encapsulation(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名输入长度错误！");
            this.name = "无名";
        }

    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance > 20.0) {
            this.balance = balance;
        } else {
            System.out.println("余额不得小于20！");
            this.balance = 0.0;
        }

    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须是6位！");
            this.password = "000000";
        }

    }

    public void showInfo() {
        System.out.println("名字:" + this.name + "\n余额：" + this.balance + "\n密码：" + this.password);
    }
}
