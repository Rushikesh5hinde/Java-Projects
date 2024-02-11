package com.assignment1;
import java.util.Scanner;

public class Que11 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows: ");
//        int rows = scanner.nextInt();
//
//        System.out.print("Enter the number of columns: ");
//        int cols = scanner.nextInt();
//
//        int[][] array = new int[rows][cols];
//
//        System.out.println("Enter the elements of the array:");
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
    	int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        double average = calculateInnermostArrayAverage(array);

        System.out.println("Average of innermost elements: " + average);
    }

    static double calculateInnermostArrayAverage(int[][] array) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }

        if (count == 0) {
            return 0; 
        }

        return (double) sum / count;
    }
}

