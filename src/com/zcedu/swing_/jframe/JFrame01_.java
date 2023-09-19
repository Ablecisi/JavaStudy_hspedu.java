package com.zcedu.swing_.jframe;

import javax.swing.*;
import java.awt.*;

/**
 * JavaStudy_hspedu.java
 * com.zcedu.swing_.jframe
 *
 * @author Ablecisi
 * @version 1.0
 * 2023/10/10
 * 星期二
 * 0:27
 */
public class JFrame01_ extends JFrame {
    //写一个构造方法来初始化窗口
    public JFrame01_(String str) {
        this.setLayout(null);//创建一个布局管理器

        JLabel jl = new JLabel();//定义一个标签
        this.setTitle("我的第一个窗口");//设置标题
        jl.setText(str);//设置内部显示的文本
        jl.setBounds(50, 50, 400, 50);//设置标签的大小
        this.add(jl);//将标签放入窗口中

        this.setBounds(50, 50, 400, 300);//设置窗口的大小
        this.setResizable(true);//设置窗口大小不可以被手动设置，（默认可以）
        this.setUndecorated(false);//设置去掉窗体的边框和标题栏
        this.setVisible(true);//设置窗口可见，（默认不可见）

        Image i = this.getToolkit().getImage("D:\\mycode\\Study\\src\\com\\zcedu\\swing_\\jframe\\preview.jpg");
        this.setIconImage(i);//设置标题图标

        /*设置点击关闭窗口之后所执行的操作，有四种
        * DO_NOTHING_ON_CLOSE：什么也不做
        * HIDE_ON_CLOSE：隐藏窗口
        * DISPOSE_ON_CLOSE：隐藏窗口，并释放窗口的资源
        * EXIT_ON_CLOSE：退出程序
        * */
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//默认条件下为：HIDE_ON_CLOSE：隐藏窗口


    }
}
