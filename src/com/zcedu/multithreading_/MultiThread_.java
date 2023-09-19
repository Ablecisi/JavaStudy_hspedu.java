package com.zcedu.multithreading_;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.multithreading_
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/8
 * 星期日
 * 22:46
 */
public class MultiThread_ {
    public static void main(String[] args) {
        //1.通过继承Tread类的方式———创建线程和创建对象一样的方法
        Thread01 thread01 = new Thread01();
        //2.利用Runnable接口方式
        Runnable_ runnable = new Runnable_();
        Thread th = new Thread(runnable);//通过Tread类构造器->(Thread(Runnable){} )传参实现
        //启动线程
        th.start();
        //线程只能被启动一次，也就是只能调用一次stat方法。当多次启动线程就会发生异常。
        try {
            th.start();//再次启动出线程
            Thread.sleep(1);//让线程睡（等待）1毫秒
            //Thread.yield();线程让步（不能指定）
            //thread01.join();让步给指定的线程
        }catch (Exception e) {
            System.out.println();

        }
        //多个线程同时启动,不能确定谁先谁后，可能会交替进行
        thread01.start();

    }
}
