package lab3;
/*
* B +
* Определить класс Комплекс. Создать массив/список/множество размерности
* n из комплексных координат. Передать его в метод, который выполнит сложение/умножение его элементов.
*
* C +
* Определить класс Прямая на плоскости (в пространстве), параметры которой задаются
* с помощью Рациональной Дроби. Определить точки пересечения прямой с осями координат.
* Определить координаты пересечения двух прямых. Создать массив/список/множество объектов
* и определить группы параллельных прямых.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static lab3.Straight.getGroupsParallel;

public class Lab3App extends Complex {
    public static void main(String[] args) {
        bTask();
        cTask();
    }

    private static void cTask() {
        List<Straight> straightArrayList = new ArrayList<>();
        straightArrayList.add(new Straight(2, -1, -3));
        straightArrayList.add(new Straight(-3, -5, 2));
        straightArrayList.add(new Straight(-3, -6, 2));
        straightArrayList.add(new Straight(-3, -8, 2));
        straightArrayList.add(new Straight(-3, -9, 4));
        straightArrayList.add(new Straight(-3, -5, 5));
        straightArrayList.add(new Straight(-1, -4, 4));
        straightArrayList.add(new Straight(-1, -1, 5));


        //печатаем все уравнения прямых и их точки пересечения с осями X и Y
        for (Straight line : straightArrayList) {
            System.out.printf("Прямая: %s;%s", line, System.lineSeparator());
            System.out.printf("Точки пересечения с осями: %s, %s;%s",
                    line.getPointIntersectionWithX(), line.getPointIntersectionWithY(), System.lineSeparator());
            System.out.println();
        }

        //ищем пересечения прямых друг с другом (первые 2 из списка)
        System.out.println("Точки пересечения 2-х прямых:");
        System.out.printf("%s;%s%s;%s", straightArrayList.get(0), System.lineSeparator(), straightArrayList.get(1), System.lineSeparator());
        System.out.printf("%s%s", straightArrayList.get(0).getPointIntersectionLines(straightArrayList.get(1)), System.lineSeparator());
        System.out.println();

        //объеденяем в группы параллельности прямых
        Map<Straight, List<Straight>> groups = getGroupsParallel(straightArrayList);

        //печатаем группы параллельности
        for (Map.Entry<Straight, List<Straight>> group : groups.entrySet()) {
            if (group.getValue().size() > 0) {
                System.out.printf("Прямая %s параллельна с:%s", group.getKey(), System.lineSeparator());
                for (Straight line : group.getValue()) {
                    System.out.printf("    %s;%s", line, System.lineSeparator());
                }
                System.out.println();
            }
        }
    }

    private static void bTask() {
        Lab3App appComplex = new Lab3App();
        List<Complex> complexList = createComplexArray();
        Complex plusComplex = appComplex.plusComplex(complexList.get(0), complexList.get(1));
        System.out.println("Result of plus operation: " + plusComplex);
        Complex minusComplex = appComplex.minusComplex(complexList.get(0), complexList.get(1));
        System.out.println("Result of minus operation: " + minusComplex);
        Complex multiplyComplex = appComplex.multiplyComplex(complexList.get(0), complexList.get(1));
        System.out.println("Result of multiply operation: " + multiplyComplex);
        Complex divideComplex = appComplex.divideComplex(complexList.get(0), complexList.get(1));
        System.out.println("Result of divide operation: " + divideComplex);
    }

    private static List<Complex> createComplexArray() {
        List<Complex> complexList = new ArrayList<>();
        complexList.add(new Complex(3,6));
        complexList.add(new Complex(4,8));
        complexList.add(new Complex(1,5));
        return complexList;
    }
}

