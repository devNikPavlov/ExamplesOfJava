package books_01.exp_01.les_01;

// Вычислить растояние? проходимое светом
// используя переменные типа long

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long second;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000;        // указать количество дней

        second = days * 24 * 60 * 60;       // преобразовать в секунду

        distance = lightspeed * second;     // вычислить растояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
