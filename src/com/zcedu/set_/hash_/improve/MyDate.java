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
 * 0:43
 */
public class MyDate{
    private String year;
    private String mouth;
    private String day;

    public MyDate(String year, String mouth, String day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public MyDate() {

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate myDate)) return false;
        return Objects.equals(getYear(), myDate.getYear()) && Objects.equals(getMouth(), myDate.getMouth()) && Objects.equals(getDay(), myDate.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMouth(), getDay());
    }
}
