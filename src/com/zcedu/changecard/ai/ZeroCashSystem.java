package com.zcedu.changecard.ai;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZeroCashSystem {
    public static void main(String[] args) {
        // 创建一个JFrame对象，用于显示窗口
        JFrame frame = new JFrame("零钱通系统");
        // 设置窗口的大小
        frame.setSize(400, 300);
        // 设置窗口的关闭操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个JPanel对象，用于存放组件
        JPanel panel = new JPanel();
        // 设置JPanel的布局管理器为 BorderLayout
        panel.setLayout(new BorderLayout());

        // 创建一个JTextField对象，用于输入零钱数量
        JTextField cashField = new JTextField(20);
        // 将JTextField添加到JPanel中，使用BorderLayout的West位置
        panel.add(cashField, BorderLayout.CENTER);

        // 创建一个JLabel对象，用于显示提示信息
        JLabel hintLabel = new JLabel("请输入零钱数量：");
        // 将JLabel添加到JPanel中，使用BorderLayout的West位置
        panel.add(hintLabel, BorderLayout.NORTH);

        // 创建一个JButton对象，用于提交零钱数量
        JButton submitButton = getjButton(cashField, frame);
        // 将JButton添加到JPanel中，使用BorderLayout的East位置
        panel.add(submitButton, BorderLayout.EAST);

        // 将JPanel添加到JFrame中
        frame.add(panel);
        // 设置JFrame为可见
        frame.setVisible(true);
    }

    @NotNull
    private static JButton getjButton(JTextField cashField, JFrame frame) {
        JButton submitButton = new JButton("提交");
        // 为JButton添加一个事件监听器
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取输入的零钱数量
                double cash = Double.parseDouble(cashField.getText());
                // 创建一个JOptionPane对象，用于显示提示信息
                JOptionPane optionPane = new JOptionPane("零钱通系统已收到：" + cash + "元");
                // 显示JOptionPane
                JOptionPane.showMessageDialog(frame, optionPane.getMessage());

            }
        });

        return submitButton;
    }
}

