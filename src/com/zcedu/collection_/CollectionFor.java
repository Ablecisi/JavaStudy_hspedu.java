package com.zcedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.collection
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/3
 * 星期二
 * 3:35
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Book("Java", "韩顺平", 100.0));
        coll.add(new Book("C语言", "谭浩强", 50.0));
        coll.add(new Book("高等数学", "宋浩", 200.0));
        for (Object Book : coll) {
            System.out.println(Book);
        }

    }
}
