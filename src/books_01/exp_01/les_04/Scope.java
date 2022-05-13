package books_01.exp_01.les_04;

// Продемонстрировать облать видимости блока кода

public class Scope {
    public static void main(String[] args) {
        int x;                  // эта переменная доступна всему коду из метода main()

        x = 10;
        if (x == 10) {          // начало новой области действия, доступной только этому блоку кода
            int y = 20;         // обе переменные x и y доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
        }
        // y = 100; // ОШИБКА! переменная y недоступна в этой области действия, тогда как X доступна и здесь
        System.out.println("X равно " + x);
    }
}