package com.company;

public class BasicMethods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = max(a, b);
        System.out.println("Max number is: " + result);

        int resultMin = min(a, b);
        System.out.println("Min number: " + resultMin);

        long d = 1000000000L;
        long c = 1000000000L;
        int sum = 0;
        long resultSum = sum(d, c);
        System.out.println("Sum of the elements is: " + resultSum);

        short m = 2;
        short n = 4;
        short resMultiply = multiply(m,n);
        System.out.println("Multiplication of the numbers is: " + resMultiply);

        int first = 15;
        int second = 85;
        int third = 123;
        int resultOfThree= compareThree(first, second, third);
        System.out.println("The biggest element is: " + resultOfThree);
    }

    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static long sum(long a, long b) {
        long sum = a + b;
        return sum;
    }

    public static short multiply(short a, short b) {
        short multiply = (short) (a * b);
        return multiply;
    }

    public static int compareThree(int a, int b, int c) {
        int max = a;
        if (a < b) {
            max = b;
        } else if (b < c) {
            max = c;
        } else if (a > c) {
        }
        return max;
    }
}
 /*
 Напишете следните методи:

Метод, който приема две числа и връща по-голямото. Методът има следната сигнатура: max(int a, int b);
Метод, който приема две числа и връща по-малкото. Методът има следната сигнатура: min(double a, double b);
Метод, който приема две числа и връща сумата им. Методът има следната сигнатура: sum(long a, long b);
Метод, който приема две числа и връща произведението им. Методът има следната сигнатура: multiply(short a, short b);
Метод, който приема три числа и връща най-голямото. Методът има следната сигнатура: max(int a, int b, int c).
Може да използвате метода max(int a, int b).

  */