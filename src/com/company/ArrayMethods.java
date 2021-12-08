package com.company;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int size = 10;
        int[] array = createArray(size);
        System.out.println("Array is: " + Arrays.toString(array));

        int sum = sumElements(array);
        System.out.println("Sum of the elements is: " + sum);

        System.out.println("Fill the array with number of the elements:");
        int[] arrayFill = fillArray(size);
        System.out.println(Arrays.toString(arrayFill));

        System.out.println("Is element in the array?");
        int element = 5;
        boolean arrayBoolean = contains(array, element);
        System.out.println(arrayBoolean);

        System.out.println("How many times element occurs in the array? ");
        int elementOccurs = 3;
        int elementOccur = countOccurrences(array, elementOccurs);
        System.out.println(elementOccur);

        System.out.println("Print elements with [] and ,: ");
        int[] arrayWithSign = printElements(array);


    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;

    }

    public static int[] fillArray(int size) {
        int[] arrayFill = new int[size];
        Arrays.fill(arrayFill, size);
        return arrayFill;

    }

    public static int sumElements(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;

        }
        return sum;
    }

    public static boolean contains(int[] array, int element) {
        for (int j : array) {
            if (element == j) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(int[] array, int element) {
        int counter = 0;
        for (int j : array) {
            if (element == j) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] printElements(int[] array) {
        for (int j : array) {

            if (j == (array.length)) {
                System.out.print("[" + j + "]");
            } else {
                System.out.print("[" + j + "], ");
            }
        }
        return array;
    }
}
/*
Напишете следните методи:

Метод, който приема размер на масив, създава масив с такъв размер, след което запълва масива с числата в интервала [1 … array.length], и накрая връща масива. Методът има следната сигнатура: createArray(int size);
Метод, който приема размер на масив, създава масив с такъв размер, след което приема array.length на брой елементи, с които запълва масива, и накрая връща масива. Методът има следната сигнатура: fillArray(int size);
Метод, който приема масив и връща сумата на елементите му. Методът има следната сигнатура: sumElements(int[] array);
Метод, който приема масив и число и връща true или false, в зависимост от това дали числото се среща в масива. Методът има следната сигнатура: contains(int[] array, int element);
Метод, който приема масив и число, и връща колко пъти числото се среща в масива. Методът има следната сигнатура: countOccurrences(int[] array, int element);
Метод, който приема масив и принтира елементите му, оградени в квадратни скоби [ ] и изредени със запетая. Методът има следната сигнатура: printElements(int[] array).
 */