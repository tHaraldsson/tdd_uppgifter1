package com.demo.uppgifter.checkout;

public class BlackFridayIDiscount implements IDiscount {

    @Override
    public double applyDiscount(double total) {
        return total * 0.5; //50% discount
    }
}
