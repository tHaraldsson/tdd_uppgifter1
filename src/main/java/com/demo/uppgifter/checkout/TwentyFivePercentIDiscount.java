package com.demo.uppgifter.checkout;

public class TwentyFivePercentIDiscount implements IDiscount {
    @Override
    public double applyDiscount(double total) {
        return (total * 0.75); //25% discount
    }
}
