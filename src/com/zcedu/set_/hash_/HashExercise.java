package com.zcedu.set_.hash_;
import java.util.HashSet;
import java.util.Objects;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.set_.hash_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/6
 * 星期五
 * 22:54
 */
public class HashExercise {
    public static void main(String[] args) {
        HashSet<Object> HS = new HashSet<>();

        HS.add(new Employee("张三",19));
        HS.add(new Employee("李四",18));
        HS.add(new Employee("王五",17));
        HS.add(new Employee("王五",17));
        //HashNoEqual(HS);
        System.out.println(HS);
    }//
/*    public static void HashNoEqual(@NotNull HashSet<Object> HS){
        String N, N1;
        int A, A1;
        for (int j = 0; j < HS.size(); j++){
            //将每一个对象抽离出来
            //System.out.println(HS.toArray()[j]);
            for (int i = 0; i < HS.size() - 1; i++) {
                try {
                    N  = ((Employee) HS.toArray()[j]).getName();
                    A  = ((Employee) HS.toArray()[j]).getAge();
                    N1 = ((Employee) HS.toArray()[i]).getName();
                    A1 = ((Employee) HS.toArray()[i]).getAge();
                    if (N.equals(N1) && A == A1 ) {
                        //System.out.println(N  + " " + A + " " + N1 + " " + A1);
                        HS.remove((HS.toArray()[j]));
                    } else {
                        //System.out.println("m");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n" + "遍历集合出错");
                }
            }
        }
    }*/

}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n名字：" + name + " 年龄：" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
