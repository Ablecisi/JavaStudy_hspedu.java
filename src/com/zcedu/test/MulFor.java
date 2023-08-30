
package com.zcedu.test;

public class MulFor {
    public MulFor() {
    }

    public static void main(String[] args) {
        int i = 9;

        for(int num1 = 1; num1 <= i; ++num1) {
            for(int num2 = 1; num2 <= num1; ++num2) {
                System.out.printf("%d*%d=%d\t", num2, num1, num1 * num2);
            }

            System.out.println();
        }

        int layernum = 5;

        int layer;
        int individual;
        int hollow;
        for(layer = 1; layer <= layernum; ++layer) {
            for(hollow = layernum; hollow >= layer; --hollow) {
                System.out.print(" ");
            }

            if (layer > layernum - 1) {
                for(individual = 1; individual <= 2 * layer - 1; ++individual) {
                    System.out.print("*");
                }
            } else {
                for(individual = 1; individual <= 2 * layer - 1; ++individual) {
                    if (individual != 1 && individual != 2 * layer - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }

        System.out.println();

        for(layer = 1; layer <= layernum; ++layer) {
            for(hollow = layernum; hollow >= layer; --hollow) {
                System.out.print(" ");
            }

            if (layer > layernum) {
                for(individual = 1; individual <= 2 * layer - 1; ++individual) {
                    System.out.print("*");
                }
            } else {
                for(individual = 1; individual <= 2 * layer - 1; ++individual) {
                    if (individual != 1 && individual != 2 * layer - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }

        for(layer = layernum - 1; layer >= 1; --layer) {
            for(hollow = layer; hollow <= layernum; ++hollow) {
                System.out.print(" ");
            }

            if (layer > layernum - 1) {
                for(individual = 2 * layer - 1; individual >= 1; --individual) {
                    System.out.print("*");
                }
            } else {
                for(individual = 2 * layer - 1; individual >= 1; --individual) {
                    if (individual != 1 && individual != 2 * layer - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println();
        }

    }
}
