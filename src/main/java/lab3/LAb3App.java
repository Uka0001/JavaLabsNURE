package lab3;
/*
* B
* Определить класс Комплекс. Создать массив/список/множество размерности
* n из комплексных координат. Передать его в метод, который выполнит сложение/умножение его элементов.
*
* C
* Определить класс Прямая на плоскости (в пространстве), параметры кото- рой задаются
* с помощью Рациональной Дроби. Определить точки пересе- чения прямой с осями координат.
* Определить координаты пересечения двух прямых. Создать массив/список/множество объектов
* и определить группы параллельных прямых.
* */

import java.util.ArrayList;
import java.util.List;

public class LAb3App extends Complex {
    public static void main(String[] args) {
        bTask();
    }

    private static void bTask() {
        LAb3App appComplex = new LAb3App();
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

