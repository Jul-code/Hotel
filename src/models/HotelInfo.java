package models;

import base.Nights;
import base.Stars;
import base.Visitors;

public class HotelInfo implements Nights, Visitors, Stars {

    // Model.
// Применение интерфейсов.
    private String name;
    private String hotelName;
    private int nights;
    private int visitors;
    private int children;
    private int pets;
    private int stars;
    private double price;
    private static final double CHILDREN_DISCOUNT = 0.5;
    private static final double PETS_PRICE_MULTIPLIER = 1.2;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getPets() {
        return pets;
    }

    public void setPets(int pets) {
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double costNumbersOfNights(int nights, double price) {
        return nights * price;
    }

    @Override
    public double costWithVisitors(int visitors, double cost) {
        return visitors * cost;
    }

    @Override
    public double costWithChildren(int children, double costNightsAndStars) {
        return children * costNightsAndStars * CHILDREN_DISCOUNT;
    }

    @Override
    public double costWithPets(int pets, double cost) {
        return pets * cost * PETS_PRICE_MULTIPLIER;
    }

    @Override
    public double applyStars(int stars, double cost) {
        return stars * cost;
    }

    public double totalCost(double costVisitors, double costChildren, double costPets) {
        return costVisitors + costChildren + costPets;
    }
}
