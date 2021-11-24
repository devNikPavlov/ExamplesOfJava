package examples01.day1;

/**
 * @author Nikolay Pavlov
 * Вывести на экран слово "JAVA", в строку, чтобы она повторилась 10 раз, используя цикл while
 */

public class Task1 {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 10) {
            System.out.printf("JAVA ");
            counter++;
        }
    }
}
