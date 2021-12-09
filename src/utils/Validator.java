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
    public static int validateNightsInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество ночей!: ");
        }
        int nights = scanner.nextInt();
        while (nights <= 0) {
            System.out.println("Неверное значение! Введите количество ночей: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество ночей!: ");
            }
            nights = scanner.nextInt();
        }
        return nights;
    }

    // Валидация ввода количества посетителей
    public static int validateVisitorsInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество взрослых посетителей!: ");
        }
        int visitors = scanner.nextInt();
        while (visitors <= 0) {
            System.out.print("Неверное значение! Введите количество взрослых посетителей: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество взрослых посетителей!: ");
            }
            visitors = scanner.nextInt();
        }
        return visitors;
    }

    // Валидация ввода количества детей
    public static int validateChildrenInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество детей!: ");
        }
        int children = scanner.nextInt();
        while (children <= 0) {
            System.out.print("Неверное значение! Введите количество детей: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество детей!: ");
            }
            children = scanner.nextInt();
        }
        return children;
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

    // Валидация ввода количества животных:
    public static int validatePetsInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите количество животных!: ");
        }
        int pets = scanner.nextInt();
        while (pets <= 0) {
            System.out.print("Неверное значение! Введите количество животных: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите количество животных!: ");
            }
            pets = scanner.nextInt();
        }
        return pets;
    }
}

