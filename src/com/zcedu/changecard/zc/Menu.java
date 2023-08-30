package com.zcedu.changecard.zc;

import java.util.Scanner;

public class Menu {
    public void menu() {

        Scanner scan = new Scanner(System.in);
        ChangeDetail detail = new ChangeDetail("--------------------零钱通明细--------------------");
        IncomeRecorded incomeRecorded = new IncomeRecorded();
        // 循环控制
        boolean loop = true;
        do {
            System.out.println("====================零钱通菜单====================");
            System.out.println("                 1. 零钱通明细");
            System.out.println("                 2. 收益入账");
            System.out.println("                 3. 消费");
            System.out.println("                 4. 退出");
            System.out.println("请输入你的选择(1-4):");

            // 获取用户输入
            String choice = scan.next();
            switch (choice) {
                case "1" ->
                    // 零钱通明细
                        detail.ShowDetail();
                case "2" -> {
                    // 收益入账
                    System.out.println("请输入收益金额:");
                    incomeRecorded.setMoney(scan.nextDouble());
                    incomeRecorded.ShowIncome(detail);
                    incomeRecorded.ShowInfo();
                }
                case "3" -> {
                    // 消费
                    System.out.println("请输入消费名称:");
                    incomeRecorded.setName(scan.next());
                    System.out.println("请输入消费金额:");
                    incomeRecorded.setMoney( incomeRecorded.getName(), scan.nextDouble());
                    incomeRecorded.ShowIncome(detail, incomeRecorded.getName());
                    incomeRecorded.ShowInfo(incomeRecorded.getName());
                }

                case "4" -> {
                    // 退出
                    System.out.println("==================零钱通系统已退出=================");
                    System.out.println("                    欢迎下次使用                  ");
                    System.exit(0);
                }
                default -> {
                    System.out.println("输入错误，请重新输入");
                    menu();
                    loop = false;
                }
            }
        } while (loop);
        scan.close();
    }
}
