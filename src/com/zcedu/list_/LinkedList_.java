package com.zcedu.list_;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.list_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/6
 * 星期五
 * 15:00
 */
public class LinkedList_ {
    public static void main(String[] args) {
        /*先实例双向链表的使用*/
        /*======================开始===================*/
        //传入两个数据作为独立的结点
        Node zc = new Node("周辰");
        Node love = new Node("爱");
        Node ly = new Node("罗羽");
        //zc->ly
        zc.next = love;
        love.next = ly;
        //ly->zc
        ly.pre = love;
        love.pre = zc;
        //头结点指向第一个数据
        Node first = zc;
        //尾结点指向最后一个数据
        Node last = ly;
        //遍历
        while (first != null) {
            System.out.print(first);
            first = first.next;
        }
        /*======================结束===================*/


    }
}
//建立一个“结点”类，用于存放数据
/*======================开始===================*/
class Node {
    public Object item;//数据
    public Node next;//指向后一个结点的指标
    public Node pre;//指向前一个结点的指标

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return (String) item;
    }
}
/*======================结束===================*/