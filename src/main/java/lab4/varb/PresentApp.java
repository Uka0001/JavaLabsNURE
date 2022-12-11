package lab4.varb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
Использовать возможности ООП: классы, наследование, полиморфизм, ин- капсуляция.
Каждый класс должен иметь отражающее смысл название и информатив- ный состав.
Наследование должно применяться только тогда, когда это имеет смысл.
При кодировании должны быть использованы соглашения об оформлении кода java code convention.
Классы должны быть грамотно разложены по пакетам.
Консольное меню должно быть минимальным.
Для хранения параметров инициализации можно использовать файлы.
- TODO
Новогодний подарок. Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет. Собрать детский подарок с определе- нием его веса.
Провести сортировку конфет в подарке на основе одного из параметров. Найти конфету в подарке,
соответствующую заданному ди- апазону содержания сахара.
*/
public class PresentApp {
    private Sweets sweet;
    private double presentWeight;

    public Sweets getSweet() {
        return sweet;
    }

    public void setSweet(Sweets sweet) {
        this.sweet = sweet;
    }

    public double getPresentWeight() {
        return presentWeight;
    }

    public void setPresentWeight(double presentWeight) {
        this.presentWeight = presentWeight;
    }

    public static void main(String[] args) {
        PresentApp presentOne = new PresentApp();
        Sweets sweetOne = new Candy("Candy", 10, SugarLevel.LOW);
        Sweets sweetTwo = new Cupcake("Cupcake", 14, SugarLevel.MEDIUM);
        Sweets sweetThree = new Lollipop("Lollipop", 8, SugarLevel.HIGH);

        List<Sweets> sweetsList = createSweetsList(sweetOne, sweetTwo, sweetThree);

        getPresentWeight(presentOne, sweetsList);

        compareWeight(sweetsList);

        findSweetWithSugarLevel(sweetsList);
    }

    private static void findSweetWithSugarLevel(List<Sweets> sweetsList) {
        for (Sweets sweet: sweetsList){
            if (sweet.getSugarLevel().equals(SugarLevel.MEDIUM)){
                System.out.println("Sweet with medium level of sweet detected: " + sweet);
            }
        }
    }

    private static void compareWeight(List<Sweets> sweetsList) {
        System.out.println("Before comparing: \n" + sweetsList);
        sweetsList.sort(Comparator.comparing(Sweets::getWeight));
        System.out.println("After comparing: \n" + sweetsList);
    }

    private static List<Sweets> createSweetsList(Sweets sweetOne, Sweets sweetTwo, Sweets sweetThree) {
        List <Sweets> sweetsList = new ArrayList<>();
        sweetsList.add(sweetOne);
        sweetsList.add(sweetTwo);
        sweetsList.add(sweetThree);
        return sweetsList;
    }

    private static void getPresentWeight(PresentApp presentOne, List<Sweets> sweetsList) {
        for (Sweets sweet: sweetsList){
            presentOne.presentWeight += sweet.getWeight();
        }
        System.out.println("Present weight is " + presentOne.getPresentWeight() + " gram.");
    }
}
