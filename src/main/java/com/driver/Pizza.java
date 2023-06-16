package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int cheesePrice;
    private int toppingsPrice;
    private int bagPrice;

    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean isTakeAway;
    private boolean billGiven;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.bill = "";
        this.basePrice = (isVeg)? 300 : 400;
        this.price = basePrice;
        this.cheesePrice = 80;
        this.toppingsPrice = (isVeg) ? 70 : 120;
        this.bagPrice = 20;

        this.cheeseAdded = false;
        this.toppingsAdded = false;
        this.isTakeAway = false;
        this.billGiven = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded) {
            this.cheeseAdded = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded) {
            this.toppingsAdded = true;
            this.price += toppingsPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            this.price += bagPrice;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
            bill = "";
            bill += "Base Price Of The Pizza: " + basePrice + "\n";
            if (cheeseAdded)
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            if (toppingsAdded)
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            if (isTakeAway)
                bill += "Paperbag Added: " + bagPrice + "\n";
            bill += "Total Price: " + (price) + "\n";
            return this.bill;


    }
}