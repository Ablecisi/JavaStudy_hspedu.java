package com.zcedu.poly_.plyparameter_;


public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getAnnual() {
        return super.getAnnual();
    }

    public void work(){
        System.out.println("打工人" + super.getName());
    }
}
