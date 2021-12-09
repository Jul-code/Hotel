package controller;

import models.HotelInfo;
import utils.Rounder;
import views.HotelView;

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

        double costNightsAndStars = model.applyStars(model.getStars(), costNights);


        double costVisitors = model.costWithVisitors(model.getVisitors(), costNightsAndStars);

        double costChildren = model.costWithChildren(model.getChildren(), costNightsAndStars);

        double costPets = model.costWithPets(model.getPets(), costNightsAndStars);

        double totalCost = model.totalCost(costVisitors, costChildren, costPets);
        String totalCostRounded = Rounder.roundValue(totalCost);

        String output = "------------------------------\n" +
                "Название отеля: " + hotelName + "\n" +
                "Период проживания (дн.): " + nights + "\n" +
                "Стоимость проживания за весь период (грн.): " + totalCostRounded;

        view.getOutput(output);
    }
}
