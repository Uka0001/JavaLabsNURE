package lab6;

import java.util.Map;

/*
Выполнить задание с книги на с 165:
на оценку 3 - вариант А(1-4).
* */
public class Lab6App {
    public static void main(String[] args) {
        StudentPartTime studentPartTimeOne
                = new StudentPartTime(true,
                3,
                Map.of("Math", 11, "Java", 20, "OOP", 30));
        StudentPartTime studentPartTimeTwo
                = new StudentPartTime(false,
                4,
                Map.of("Math", 11, "Java", 20, "OOP", 30));
        System.out.println(studentPartTimeOne.isStudent());
        System.out.println(studentPartTimeOne.getYearOfStudying());
        System.out.println(studentPartTimeOne.getMark("Math"));
        System.out.println(studentPartTimeOne.getMark("C++"));
        System.out.println(studentPartTimeTwo.getYear());
    }
}
