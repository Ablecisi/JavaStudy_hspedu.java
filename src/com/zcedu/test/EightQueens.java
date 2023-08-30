
package com.zcedu.test;

import java.util.Arrays;

public class EightQueens {
    public static void main(String[] args) {
        // 创建一个整数数组，用于存储皇后放置的位置
        int[] queens = new int[8];
        // 初始化数组为-1，表示皇后还没有放置
        Arrays.fill(queens, -1);
        // 调用nQueens方法，计算并输出八皇后问题的解决方案
        nQueens(0, queens);
    }

    /**
     * n皇后问题递归方法
     * @param row 当前行数
     * @param queens 存储皇后位置的数组
     */
    public static void nQueens(int row, int[] queens) {
        // 如果已经遍历完所有行，说明找到了一个解决方案，打印结果
        if (row == queens.length) {
            printSolution(queens);
            return;
        }
        // 遍历当前行的每一列，尝试放置皇后
        for (int col = 0; col < queens.length; col++) {
            // 如果当前列不与前面已经放置的皇后发生冲突，可以放置皇后
            if (isSafe(row, col, queens)) {
                // 放置皇后，并将当前位置标记为已放置
                queens[row] = col;
                // 继续遍历下一行
                nQueens(row + 1, queens);
                // 回溯，撤销放置的皇后，以便尝试其他位置
                queens[row] = -1;
            }
        }
    }

    /**
     * 判断在当前位置放置皇后是否安全
     * @param row 当前行数
     * @param col 当前列数
     * @param queens 存储皇后位置的数组
     * @return 如果当前位置不与前面已经放置的皇后发生冲突，返回true，否则返回false
     */
    private static boolean isSafe(int row, int col, int[] queens) {
        // 检查当前行
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印解决方案
     * @param queens 存储皇后位置的数组
     */
    private static void printSolution(int[] queens) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

