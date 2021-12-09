package views;

import models.HotelInfo;
import utils.Validator;

import java.util.Scanner;

public class HotelView {

    HotelInfo model;
    String title;
    String name;
    String hotelName;
    int nights;
    int visitors;
    int children;
    int pets;
    int stars;
    Scanner scanner;

    // Конструктор
    public HotelView(HotelInfo model) {
        this.model = model;
    }

    // Ввод данных
    public void getInputs() {

        // Создаем экземпляр Scanner
        scanner = new Scanner(System.in);

        // Ввод и валидация данных

        title = "Введите имя клиента: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите название отеля: ";
        System.out.print(title);
        hotelName = Validator.validateHotelName(scanner);
        model.setHotelName(hotelName);

        title = "Введите количество звезд отеля: ";
        System.out.print(title);
        stars = Validator.validateStarsInput(scanner);
        model.setStars(stars);

        title = "Введите количество ночей: ";
        System.out.print(title);
        nights = Validator.validateNightsInput(scanner);
        model.setNights(nights);

        title = "Введите количество взрослых посетителей: ";
        System.out.print(title);
        visitors = Validator.validateVisitorsInput(scanner);
        model.setVisitors(visitors);

        title = "Введите количество детей: ";
        System.out.print(title);
        children = Validator.validateChildrenInput(scanner);
        model.setChildren(children);

        title = "Введите количество животных: ";
        System.out.print(title);
        pets = Validator.validatePetsInput(scanner);
        model.setPets(pets);

        // Закрываем Scanner
        scanner.close();
    }

    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }
}
