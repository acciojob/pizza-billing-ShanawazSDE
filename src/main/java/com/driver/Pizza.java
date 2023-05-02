package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseAsked;
    private boolean toppingsAsked;
    private boolean isTakeAway;

    private int toppingPrice;
    public Pizza(Boolean isVeg){
        
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        this.price += (isVeg)? 300 : 400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAsked){
        this.price += 80;
        cheeseAsked = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAsked){
         this.toppingPrice = (isVeg) ? 70 : 120;
         this.price += toppingPrice;
         toppingsAsked = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
       // bill = "";
        bill += "Base Price Of The Pizza: "+(isVeg ? 300 : 400)+"\n";
        if(cheeseAsked) bill += "Extra Cheese Added: 80\n";
        if(toppingsAsked) bill += "Extra Toppings Added: "+toppingPrice+"\n";
        if(isTakeAway) bill += "Paperbag Added: 20\n";
        bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
