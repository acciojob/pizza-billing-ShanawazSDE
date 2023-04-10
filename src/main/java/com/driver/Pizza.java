package com.driver;

class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAsked;
    private boolean toppingsAsked;
    private boolean isTakeAway;
    public Pizza(Boolean isVeg){
        
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        this.price += (isVeg)? 300 : 400;
        bill += "Base Price Of The Pizza: "+price+"\n";
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
         this.price += (isVeg) ? 70 : 120;
         toppingsAsked = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price += 20;
        isTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        if(cheeseAsked) bill += "Extra Cheese Added: 80\n";
        if(toppingsAsked) bill += "Extra Toppings Added: 120\n";
        if(isTakeAway) bill += "Paperbag Added: 20\n";
        bill += "Total Price: "+price+"";
        return this.bill;
    }
}
