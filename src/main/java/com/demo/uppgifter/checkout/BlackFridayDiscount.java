package com.demo.uppgifter.checkout;

public class BlackFridayDiscount implements Discount {

    @Override
    public double applyDiscount(double total) {
        return total * 0.5; //50% discount
    }
}
