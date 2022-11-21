package lab1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lab1App {
    public static void main(String[] args) {
        evaluateMinMax();
    }

    private static void evaluateMinMax() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            integerList.add(scanner.nextInt());
        }
        scanner.close();
        integerList.sort(Comparator.naturalOrder());
        System.out.println("min value = " + integerList.get(0));
        System.out.println("max value = " + integerList.get(integerList.size() - 1));
    }
}
