
package com.zcedu.test;

class MiGong {
    public static void main(String[] args) {
        int height = 8;
        int width = 7;
        int[][] map = new int[height][width];
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;

        int i;
        for( i = 0; i < height; ++i) {
            map[i][0] = 1;
            map[i][width - 1] = 1;

            for(i = 0; i < width; ++i) {
                map[0][i] = 1;
                map[height - 1][i] = 1;
                System.out.print(map[i][i] + " ");
            }

            System.out.println();
        }

        MiGongPath P = new MiGongPath();
        P.findWay(map, 1, 1);
        System.out.println("\n结果如下:");

        for(i = 0; i < height; ++i) {
            for(int j = 0; j < width; ++j) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

    }
}
