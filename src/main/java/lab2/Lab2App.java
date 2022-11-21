package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Lab2App {
    public static void main(String[] args) {
        Lab2App app = new Lab2App();
        int[][] aMatrix = app.createAndPrintMatrix(app);
        printMatrix(aMatrix);
        int[][] shiftDownMatrix = app.shiftDown(aMatrix, 1);
        printMatrix(shiftDownMatrix);
        int[][] shiftUpMatrix = app.shiftUp(aMatrix, 1);
        printMatrix(shiftUpMatrix);
        int[][] shiftLeftMatrix = app.shiftLeft(aMatrix, 1);
        printMatrix(shiftLeftMatrix);
        int[][] shiftRightMatrix = app.shiftRight(aMatrix, 1);
        printMatrix(shiftRightMatrix);


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
        System.out.println("Matrix - " + matrix + " was printed");
    }

    private int[][] shiftDown(int[][] matrix, int interval) {
        return Stream.concat(
                        Arrays.stream(matrix, matrix.length - interval, matrix.length),
                        Arrays.stream(matrix, 0, matrix.length - interval))
                .toArray(int[][]::new);
    }

    private int[][] shiftRight(int[][] matrix, int interval) { //-TODO
        return Stream.concat(
                        Arrays.stream(matrix, matrix.length - interval, matrix.length),
                        Arrays.stream(matrix, 0, matrix.length))
                .toArray(int[][]::new);
    }

    private int[][] shiftLeft(int[][] matrix, int interval) { // - TODO
        return Stream.concat(
                        Arrays.stream(matrix, interval, matrix.length),
                        Arrays.stream(matrix, 0, matrix.length))
                .toArray(int[][]::new);
    }

    private int[][] createAndPrintMatrix(Lab2App lab2App) {
        int nNumber = lab2App.getNumber();
        int[][] aMatrix = new int[nNumber][nNumber];
        Random random = new Random();
        for (int i = 0; i < nNumber; i++) {
            for (int j = 0; j < nNumber; j++) {
                aMatrix[i][j] = random.nextInt(-nNumber, nNumber);
            }
        }
        System.out.println("Matrix has created!");
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
