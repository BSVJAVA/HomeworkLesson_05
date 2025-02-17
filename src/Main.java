public class Main {
    public static void main(String[] args) {
        // Задача №1
        for (byte i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        // Задача №2
        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача №3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача №4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача №5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача №6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача №7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задача №8
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача №9
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача №10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }
        System.out.println("Hello, World!");
    }
}