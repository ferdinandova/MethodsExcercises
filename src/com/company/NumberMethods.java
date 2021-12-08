package com.company;

import java.util.Scanner;

public class NumberMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Count the digits of your number:");
        int x = Integer.parseInt(scanner.nextLine());
        int digits = countDigits(x);
        System.out.println(digits);

        System.out.println("Is your number even or odd?");
        String odd = getParity(x);
        System.out.println(odd);

        String prime = isPrime(x);
        System.out.println(prime);

        System.out.println("Enter number to create an array with its characters:");
        byte num = scanner.nextByte();
        byte[] numberArray = createArray(num);
        System.out.println(numberArray);
    }

    public static int countDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;

    }

    public static String isPrime(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter <= 2 ? "Your number is prime." : "Your number is not prime.";

    }

    public static String getParity(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static byte[] createArray(byte number) {
        int counter = 0;
        byte num = number;
        while (num / 10 == 0) {
            num = (byte) (num / 10);
            counter++;
        }
        byte[] array = new byte[counter];
        for (int i = array.length - 1; i >= 0; i--) {
            byte digit = (byte) (number % 10);
            array[i] = digit;
            number /= 10;
        }
        return array;

    }


}
/*
Напишете следните методи:

Метод, който приема число и връща броя цифри на числото. Методът има следната сигнатура: countDigits(int number);
Метод, който приема число и връща true или false, в зависимост от това дали числото е просто. Методът има следната сигнатура: isPrime(int number);
Метод, който приема число и връща even или odd, в зависимост от това дали числото е четно или нечетно. Методът има следната сигнатура: getParity(int number);
Метод, който приема число и връща масив, чиито елементи са цифрите на числото. Методът има следната сигнатура: createArray(byte number).
 */