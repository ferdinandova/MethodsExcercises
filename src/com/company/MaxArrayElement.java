package com.company;

public class MaxArrayElement {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int bigger = biggerOfTwoNumbers(x, y);
        System.out.println(bigger);

    }

    public static int biggerOfTwoNumbers(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
            return max;
        } else {
            max = b;
            return max;
        }
    }
}
/*
Напишете метод, който връща по-голямото от две числа. Използвайте метода, за да намерите най-големия по стойност елемент в даден масив.
 */