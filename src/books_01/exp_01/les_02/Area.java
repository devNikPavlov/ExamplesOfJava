package books_01.exp_01.les_02;

// Вычислить площадь круга

public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8;           // радиус окружности
        pi = 3.1416;        // приблизительное значение числа пи
        a = pi * r * r;     // вычислить площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}