package utils;

import java.util.Scanner;

public class Validator {
    // Валидация ввода имени
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("Пусто! Введите имя: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    //Валидация ввода названия отеля
    public static String validateHotelName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("Пусто! Введите название отеля: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества ночей
    public static int validateCostNightInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество ночей!: ");
        }
        int costNights = scanner.nextInt();
        while (costNights <= 0) {
            System.out.println("Неверное значение! Введите количество ночей: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество ночей!: ");
            }
            costNights = scanner.nextInt();
        }
        return costNights;
    }

    // Валидация ввода количества посетителей
    public static int validateCostVisitorsInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество посетителей!: ");
        }
        int costVisitors = scanner.nextInt();
        while (costVisitors <= 0) {
            System.out.print("Неверное значение! Введите количество посетителей: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество посетителей!: ");
            }
            costVisitors = scanner.nextInt();
        }
        return costVisitors;
    }

    // Валидация ввода количества детей
    public static int validateCostChildInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество детей!: ");
        }
        int costChild = scanner.nextInt();
        while (costChild <= 0) {
            System.out.print("Неверное значение! Введите количество детей: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество детей!: ");
            }
            costChild = scanner.nextInt();
        }
        return costChild;
    }


    // Валидация ввода количества звезд отеля
    public static int validateStarsInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество звезд отеля!: ");
        }
        int stars = scanner.nextInt();
        while (stars <= 0) {
            System.out.print("Неверное значение! Введите количество звезд отеля!: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество звезд отеля!: ");
            }
            stars = scanner.nextInt();
        }
        return stars;
    }
}

