package books_01.exp_01.les_06;

// Продемонстрируем применение одномерного массива

public class Array {
    public static void main(String[] args) {
        int mouth_days[];

        mouth_days = new int[12];

        mouth_days[0] = 31;
        mouth_days[1] = 28;
        mouth_days[2] = 31;
        mouth_days[3] = 30;
        mouth_days[4] = 31;
        mouth_days[5] = 30;
        mouth_days[6] = 31;
        mouth_days[7] = 31;
        mouth_days[8] = 30;
        mouth_days[9] = 31;
        mouth_days[10] = 30;
        mouth_days[11] = 31;

        System.out.println("В апреле " + mouth_days[3] + " дней.");
    }
}
