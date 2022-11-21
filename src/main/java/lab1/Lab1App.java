package lab1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lab1App {
    public static void main(String[] args) {
        List<Integer> integerList = createArray(); //creating an ArrayList
        evaluateMinMax(integerList); //sorting by default Java ArrayList method
        bubbleListSort(integerList); //sorting by for and if

    }

    /*Bubble sorting for ArrayList*/
    private static void bubbleListSort(List<Integer> integerList) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) >= max) {
                max = integerList.get(i);
            }
            if (integerList.get(i) <= min) {
                min = integerList.get(i);
            }
        }
        System.out.println("Bubble sort: min value = " + min);
        System.out.println("Bubble sort: max value = " + max);
    }

    /*Method for creating an ArrayList*/
    private static List<Integer> createArray() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            integerList.add(scanner.nextInt());
        }
        scanner.close();
        return integerList;
    }

    /*Java sorting default method*/
    private static void evaluateMinMax(List arrayList) {
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Array sort method: min value = " + arrayList.get(0));
        System.out.println("Array sort method: max value = " + arrayList.get(arrayList.size() - 1));
    }
}
