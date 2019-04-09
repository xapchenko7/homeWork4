package com.gmail.xapchenko2000;

public class Main {

    public static void main(String[] args) {
        //numbers(5);
        //drawRectangle(2,3);
        // drawRectangle(5);
        //getMax(15, 10);
        //getMax(5, 4.24f);
        //numbersRec(5);
    }

    public static void numbers(int x) {

        for (int i = 1; i < x + 1; i++) {
            System.out.print(" " + i);
        }
    }

    public static void drawRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static int getMax(int a, int b) {
        int max;

        max = a > b ? a : b;
        System.out.println(max);
        return max;
    }

    public static float getMax(int a, float b) {
        float max;

        max = (a > b) ? a : b;
        System.out.println(max);
        return max;
    }

    public static void numbersRec(int x) {


        int a = 1;
        try {
            int m = a / x;
            System.out.println(x);
            x--;
            numbersRec(x);
        } catch (ArithmeticException e) {

            return;
        }

    }
}
