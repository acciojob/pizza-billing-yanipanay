package com.driver;

public class Pizza {



    private int price;

    public void setPrice(int price) {
        this.price = price;
    }



    private Boolean isVeg;

    public Boolean getVeg() {
        return isVeg;
    }
    private String bill;
    private boolean cheese;
    private boolean toppings;
    private boolean bag;
    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        price = (isVeg ? 300:400);
        bill="";
        cheese=false;
        toppings=false;
        bag = false;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese) price+=80;
        this.cheese = true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings) price+=(isVeg ? 70:120);
        this.toppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!bag) price+=20;
        this.bag = true;
    }

    public String getBill(){
        // your code goes here
        bill+="Base Price Of The Pizza: "+(isVeg ? 300 :400)+"\n";

        if(cheese) {
            bill+="Extra Cheese Added: "+80+"\n";

        }
        if(toppings) {
            bill+="Extra Toppings Added: "+(isVeg ? 70:120)+"\n";

        }
        if(bag) {
            bill+="Paperbag Added: "+20+"\n";

        }
        bill+="Total Price: "+price;
        return this.bill;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isToppings() {
        return toppings;
    }

    public boolean isBag() {
        return bag;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setToppings(boolean toppings) {
        this.toppings = toppings;
    }

    public void setBag(boolean bag) {
        this.bag = bag;
    }
}
