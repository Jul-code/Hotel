package view;

import model.HotelInfo;
import utils.Validator;

import java.util.Scanner;

public class HotelView {

    HotelInfo model;
    String title;
    String name;
    String hotelName;
    int costNights;
    int costVisitors;
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
        costNights = Validator.validateCostNightInput(scanner);
        model.setNights(costNights);

        title = "Введите количество посетителей: ";
        System.out.print(title);
        costVisitors = Validator.validateCostVisitorsInput(scanner);
        model.setVisitors(costVisitors);

        // Закрываем Scanner
        scanner.close();
    }

    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }
}
