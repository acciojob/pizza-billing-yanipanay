package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        setCheese(true);
        setToppings(true);
        // your code goes here
    }

    public int getPrice(){

        int dpprice = super.getPrice()+(isCheese()?80:0)+(isToppings() ? (getVeg() ? 70:120) :0);
        return dpprice;
    }


}
