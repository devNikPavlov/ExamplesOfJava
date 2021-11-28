package examples01.day2;

import java.util.Scanner;

/**
 * @author Nikolay Pavlov
 *
 * Релизовать аналогичную программу №2, использую цикл while
 */

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int t = a + 1;
        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0) {
                System.out.print(t + " ");
            }

            t++;
        }
    }
}








