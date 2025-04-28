package com.demo.uppgifter.checkout;

public class TenPercentDiscount implements Discount {
    @Override
    public double applyDiscount(double total) {
        return (total * 0.90); //10% discount
    }
}
