package com.zcedu.set_.hash_.improve;

import java.util.Objects;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.set_.hash_.improve
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/7
 * 星期六
 * 0:41
 */
public class Employee extends MyDate {
    private String name;
    private int sal;
    private MyDate birthday;
    private String year;
    private String mouth;
    private String day;

    public Employee(String name, int sal, String year, String mouth, String day) {
        super(year, mouth, day);
        this.name = name;
        this.sal = sal;
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String getDay() {
        return day;
    }

    @Override
    public void setDay(String day) {
        this.day = day;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return getSal() == employee.getSal() && Objects.equals(getName(), employee.getName()) && Objects.equals(getYear(), employee.getYear()) && Objects.equals(getMouth(), employee.getMouth()) && Objects.equals(getDay(), employee.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getSal(), getYear(), getMouth(), getDay());
    }

    @Override
    public String toString() {
        return
                  '\n' +
                        "name = " + name + '\n' +
                        "sal = " + sal + '\n' +
                        "year = " + year + '\n' +
                        "mouth = " + mouth + '\n' +
                        "day = " + day + '\n' ;
    }
}
