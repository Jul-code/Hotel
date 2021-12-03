package controller;

import model.HotelInfo;
import utils.Rounder;
import view.HotelView;

public class ClientController {

    HotelInfo model;
    HotelView view;

    // Конструктор
    public ClientController(HotelInfo hotel, HotelView hotelView) {

        this.model = hotel;
        this.view = hotelView;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();
        String hotelName = model.getHotelName();
        int nights = model.getNights();

        double costNights = model.costNumbersOfNights(model.getNights(), model.getPrice());

        double costVisitors = model.costWithVisitors(model.getVisitors(), costNights);

        double totalCost = model.applyStars(model.getStars(), costVisitors);
        String totalCostRounded = Rounder.roundValue(totalCost);

        String output = "------------------------------\n" +
                "Имя клиента: " + name + "\n" +
                "Название отеля: " + hotelName + "\n" +
                "Период проживания (дн.): " + nights + "\n" +
                "Стоимость проживания за весь период (грн.): " + totalCostRounded;

        view.getOutput(output);
    }
}
