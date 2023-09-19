package com.zcedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.collection
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/3
 */
@SuppressWarnings({"all"})
public class CollectionIterator {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Book("Java", "韩顺平", 100.0));
        coll.add(new Book("C语言", "谭浩强", 50.0));
        coll.add(new Book("高等数学", "宋浩", 200.0));
        Iterator iterator = coll.iterator();
        System.out.println(iterator.hashCode());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(iterator.hashCode());

        /*iterator = coll.iterator();
        System.out.println(iterator.hashCode());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.hashCode());*//*重置迭代器本质是开一新的空间*/




    }
}
@SuppressWarnings({"all"})
class Book{
    public String name;
    public String author;
    public double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{"+
                "name='" + name + "' " +
                ", author='" + author + "' " +
                ", price=" + price +
                "}";
    }
}
