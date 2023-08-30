package com.zcedu.poly_.plyparameter_;

public class PolyParameter {
    public static void main(String[] args){

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("smith" , 1000);
        employees[1] = new Worker("jack" , 3000);
        employees[2] = new Manager("tom" , 8000 , 1000);

        for (int i = 0; i < 3; i++) {
            testWork(employees[i]);
            showEmpAnnual(employees[i]);
            System.out.println();
        }

    }

    //===========================================//
    public static void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public static void testWork(Employee e){
        if (e instanceof Worker) {
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }else {
            System.out.println("普通人" + e.getName());
        }
    }
    //===========================================//

}
