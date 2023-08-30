package com.zcedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args){
        Person[] persons = new Person[5];
        persons[0] = new Person("ren" , 0);
        persons[1] = new Teacher("scott", 27 , 32005);
        persons[2] = new Teacher("smith", 26 , 32100);
        persons[3] = new Student("jack", 19 , 100);
        persons[4] = new Student("tom", 18 , 92.1);
        //遍历数组，调用say方法
        for (int i = 0; i < 5; i++) {
            //编译类型都是Person，运行类型根据实际情况由JVM判断
            if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }else if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            }
            else{
                System.out.println("普通人");
            }
            System.out.println(persons[i].say());//动态绑定机制
            System.out.println();
        }

    }
}
