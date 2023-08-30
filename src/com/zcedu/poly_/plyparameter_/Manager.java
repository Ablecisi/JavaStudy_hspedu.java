package com.zcedu.poly_.plyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus * 12;
    }

    @Override
    public String getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage(){
        System.out.println("管理人" + super.getName());
    }
}
