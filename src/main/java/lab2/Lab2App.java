package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Lab2App {
    public static void main(String[] args) {
        Lab2App app = new Lab2App();
        int nNumber = app.getNumber();
        int[][] aMatrix = app.createAndPrintMatrix(app, nNumber);
        printMatrix(aMatrix);
        int[][] shiftDownMatrix = app.shiftDown(aMatrix, 1);
        printMatrix(shiftDownMatrix);
        int[][] shiftUpMatrix = app.shiftUp(aMatrix, 1);
        printMatrix(shiftUpMatrix);
        app.shiftRightAndLeft(aMatrix, 1, nNumber); // shifting left
        app.shiftRightAndLeft(aMatrix, 11, nNumber);
        app.shiftRightAndLeft(aMatrix, -23, nNumber);

    }

    private int[][] shiftUp(int[][] matrix, int interval) {
        return Stream.concat(
                        Arrays.stream(matrix, interval, matrix.length),
                        Arrays.stream(matrix, 0, interval))
                .toArray(int[][]::new);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println("");
        }
        System.out.println("Matrix - " + matrix + " was printed\n");
    }

    private int[][] shiftDown(int[][] matrix, int interval) {
        return Stream.concat(
                        Arrays.stream(matrix, matrix.length - interval, matrix.length),
                        Arrays.stream(matrix, 0, matrix.length - interval))
                .toArray(int[][]::new);
    }

    private int[][] shiftRightAndLeft(int[][] matrix, int interval, int nNumber) { //-TODO
        System.out.println("Shifting matrix for " + interval);

        if (interval > nNumber | interval < 1) {
            System.out.println("Shifting is  not possible, counting possible interval");
            while (interval > nNumber | interval < 1) {
                //creating valid number of interval if it > nNumber
                interval = Math.abs(interval % nNumber);
            }
        }

        System.out.println("Possible interval is " + interval + " for number " + nNumber);

        int j = 0;
        while (j < nNumber) {

            // Print elements from index k
            for (int i = interval; i < nNumber; i++) {
                System.out.print(matrix[j][i] + " ");
            }

            // Print elements before index k
            for (int i = 0; i < interval; i++) {
                System.out.print(matrix[j][i] + " ");
            }

            System.out.println();
            j++;
        }
        System.out.println("Shifting done.\nMatrix - " + matrix + " was printed\n");
        return matrix;
    }

    private int[][] createAndPrintMatrix(Lab2App lab2App, int nNumber) {
        int[][] aMatrix = new int[nNumber][nNumber];
        Random random = new Random();
        for (int i = 0; i < nNumber; i++) {
            for (int j = 0; j < nNumber; j++) {
                aMatrix[i][j] = random.nextInt(-nNumber, nNumber);
            }
        }
        System.out.println("Matrix " + aMatrix + " has created!\n");
        return aMatrix;
    }

    public int getNumber() {
        System.out.println("To create matrix input the 'n' number");
        Scanner scanner = new Scanner(System.in);
        int nNumber = scanner.nextInt();
        scanner.close();
        return nNumber;
    }
}
