package lab7;
/*
Выполнить задание с книги на с 194:
на оценку 3 - вариант А.
на оценку 4 - вариант В и С.
Вариант A
2. В тексте каждую букву заменить ее порядковым номером в алфавите.
При выводе в одной строке печатать текст с двумя пробелами между буквами,
 в следующей строке внизу под каждой буквой печатать ее номер.
* */
public class Lab7App {
    public static void main(String[] args) {
        String stringFirst = "I new some words";
        char [] chars = stringFirst.replaceAll(" ", "").toLowerCase().toCharArray();
        int [] charsNumbers = new int[chars.length];
        int count = 0;

        for (char c: chars){
            if (Character.isLetter(c)){
                charsNumbers[count] = c - 96;
                count++;
            }
        }
        StringBuilder charBuilder = new StringBuilder();
        StringBuilder intBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                charBuilder.append(chars[i]).append("  ");
                intBuilder.append(charsNumbers[i]).append("  ");
            }
        }

        System.out.println(charBuilder);
        System.out.println(intBuilder);
    }
}
