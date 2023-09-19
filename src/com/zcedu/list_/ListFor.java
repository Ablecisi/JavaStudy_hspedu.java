package com.zcedu.list_;
import java.util.*;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.list_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/5
 * 星期四
 * 13:05
 */
public class ListFor {
    public static void main(String[] args) {
        //List/*<String>*/ list = new ArrayList<>();
        //List/*<String>*/ list = new ArrayList<>();
        List<Object>/*<String>*/ list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        //遍历
        //1.迭代器
        Iterator<Object>/*<String>*/ iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }System.out.println("====while循环====");
        //2.增强for循环
        for (Object/*String*/ s : list){
            System.out.println(s);

        }System.out.println("====增强for====");
        //3.普通for循环
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

        }System.out.println("====普通for====");
    }
}
