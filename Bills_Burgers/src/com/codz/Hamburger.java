package com.codz;

import com.codz.toppings.*;

public class Hamburger {
    //Number of burgers made
    private static int NUMBER_OF_BURGERS_MADE = 0;

    private String name;
    private String breadRollType;
    private String meat;

    //Toppings
    private Lettuce lettuce;
    private Tomato tomato;
    private Carrot carrot;
    private Cheese cheese;

    //Accounting Purpose
    private static int number_of_hamburgers_sold;


    //Burger Price
    private double price;
    private final double basePrice = 1.6;

    public Hamburger(){
        //Class Constructor with no parameters
        this.name = "Basic";
        this.breadRollType = "white";
        this.meat = "Small Beef flat";
        this.price = basePrice;
    }

    //Adding Toppings
    public void addLettuce(){
        this.lettuce = new Lettuce();
        System.out.println("Added " + lettuce.getName() + " ... " + " price : " + lettuce.getPrice());
    }

    public void addTomato(){
        this.tomato = new Tomato();
        System.out.println("Added " + tomato.getName() + " ... " + " price : " + tomato.getPrice());
    }

    public void addCarrot(){
        this.carrot = new Carrot();
        System.out.println("Added " + carrot.getName() + " ... " + " price : " + carrot.getPrice());
    }

    public void addCheese(){
        this.cheese = new Cheese();
        System.out.println("Added " + cheese.getName() + " ... " + " price : " + cheese.getPrice());
    }

    //Customizing burger
    public void customizeBurger(){
        System.out.println("Customizing burger ...");
//        System.out.println("Base price of " + this.name + " Burger with " + this.breadRollType +
//                " roll type is " + this.price);
        if ( lettuce != null ){
            this.price += lettuce.getPrice();
        }
        if ( tomato != null ){
            this.price += tomato.getPrice();
        }
        if ( carrot != null ){
            this.price += carrot.getPrice();
        }
        if ( cheese != null ){
            this.price += cheese.getPrice();
        }
        sellBurgers();
    }


    //Setters to be used in child classes as super
    public void setName(String name) {
        this.name = name;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    //Getters to be used in child classes as super


    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    protected void sellBurgers(){
        number_of_hamburgers_sold++;
    }

    public int getNumber_of_hamburgers_sold() {
        return number_of_hamburgers_sold;
    }
}
