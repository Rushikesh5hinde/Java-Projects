package com.assignment1;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (square matrix): ");
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Upper Triangular Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

