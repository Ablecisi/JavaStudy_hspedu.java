package com.zcedu.multithreading_;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.multithreading_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/8
 * 星期日
 * 22:44
 */
public class Runnable_ implements Runnable {

    @Override
    public void run() {
        Thread01 thread01 = new Thread01();
        //thread01.run();
        System.out.println("通过实现Runnable接口，实现多线程");
    }
}
