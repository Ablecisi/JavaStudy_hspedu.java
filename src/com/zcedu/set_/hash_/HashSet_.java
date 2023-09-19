package com.zcedu.set_.hash_;


import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ForkJoinPool;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.set_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/6
 * 星期五
 * 16:51
 */
public class HashSet_ {
    public static void main(String[] args) {
        Node[] table = new Node[10];
        Node jack = new Node("jack",null);
        table[2] = jack;
        @Deprecated Node tom = new Node("tom",null);
        jack.next = tom;
        System.out.println(Arrays.toString(table));
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                for (int j = 0; j <= i; j++){
                    System.out.print("\t");
                }
            }


        }
        while (jack != null) {
            System.out.print(jack + "->");
            jack = jack.next;
        }
    }
}
class Node {
    public Object item;
    public Node next;
    public Node prev;

    public Node(Node prev, Object item, Node next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
    public Node(Node prev, Object item) {
        this.item = item;
        this.prev = prev;
    }
    public Node( Object item) {
        this.item = item;
    }
    public Node() {}

    @Override
    public String toString() {
        return (String)item;
    }
}