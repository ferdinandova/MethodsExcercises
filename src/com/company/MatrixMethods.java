package com.company;

import java.util.Scanner;

public class MatrixMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter rows count: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter columns count: ");
        int y = Integer.parseInt(scanner.nextLine());

        int[][] matrix = createMatrix(x, y);
        System.out.println("Your matrix is: ");
        printMatrix(matrix);

        System.out.println("Please enter row number: ");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter column number: ");
        int c = Integer.parseInt(scanner.nextLine());

        boolean valid = areIndexesValid(matrix, r, c);
        System.out.println(valid ? "Indexes are in matrix." : "Indexes are out of matrix.");

        int max = getMaxElement(matrix);
        System.out.println("Biggest element of the matrix is: " + max);

        int [][] maxSub = getSubmatrixWithMaxSum(matrix);
        System.out.println("Submatrix with the biggest sum: ");
        printMatrix(maxSub);

    }

    public static int[][] createMatrix(int rowsCount, int columnsCount) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rowsCount][columnsCount];
        System.out.println("Fill the matrix:");
        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < columnsCount; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static boolean areIndexesValid(int[][] matrix, int rowIndex, int columnIndex) {
        if (rowIndex <= matrix.length) {
            return matrix[rowIndex].length >= columnIndex;
        }
        return false;
    }

    public static int getMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    public static int[][] getSubmatrixWithMaxSum(int[][] matrix) {
        int sumMaxSubmatrix = 0;
        int [][] maxMatrix = {};
        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                int[][] subMatrix = {{matrix[row][col], matrix[row][col + 1]},
                                     {matrix[row + 1][col], matrix[row + 1][col + 1]}};
                if (sumMaxSubmatrix < (matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1])) {
                    sumMaxSubmatrix = (matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1]);
                    maxMatrix = subMatrix;

                }

            }
        }
        return maxMatrix;
    }

    public static void printMatrix(int [][] matrix) {
        for (int[] ints : matrix) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }
}
/*
Напишете следните методи:

Метод, който приема размерите на матрица, създава матрицата, след което приема елементи, така че да я запълни, накрая връща матрицата. Методът има следната сигнатура: createMatrix(int rowsCount, int columnsCount);
Метод, който приема матрица и две числа - индекс на ред и индекс на колона. Методът връща true или false, в зависимост от това дали индексите са валидни (в матрицата) или невалидни (извън матрицата). Методът има следната сигнатура: areIndexesValid(int[][] matrix, int rowIndex, int columnIndex);
Метод, който приема матрица и връща елемента (числото) с най-голяма стойност. Методът има следната сигнатура: getMaxElement(int[][] matrix);
Метод, който приема матрица и връща 4 числа - подматрица 2 x 2 от матрицата, чиито елементи имат най-голяма сума в сравнение с всяка друга 2 x 2 подматрица от матрицата. Методът има следната сигнатура: getSubmatrixWithMaxSum(int[][] matrix).
 */