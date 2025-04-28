package com.demo.uppgifter.checkout;

public class ShoppingCart {
    private IDiscount IDiscount;

    public ShoppingCart(IDiscount IDiscount) {
        this.IDiscount = IDiscount;
    }

    public double calculateTotal(double total) {
        return IDiscount.applyDiscount(total);
    }
}
