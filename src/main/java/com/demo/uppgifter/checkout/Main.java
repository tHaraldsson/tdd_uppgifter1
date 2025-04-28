package com.demo.uppgifter.checkout;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Laptop", 1000, 1);
        Item item2 = new Item("Phone", 500, 2);
        ShoppingCart shoppingCart = new ShoppingCart(new IDiscount() {
            @Override
            public double applyDiscount(double total) {
                return total * 0.9; //10% discount
            }
        });
        ShoppingCart shoppingCart2 = new ShoppingCart(new BlackFridayIDiscount());//50% discount

        double totalBeforeDiscount = calculateTotalPrice(item1, item2);
        System.out.println("total before discount: " + totalBeforeDiscount);

//        Discount discount = new TenPercentDiscount();
//        double totalAfterDiscount = discount.applyDiscount(totalBeforeDiscount);
        double totalAfterDiscount = shoppingCart.calculateTotal(totalBeforeDiscount);
        System.out.println("total after discount: " + totalAfterDiscount);


    }


    public static double calculateTotalPrice(Item... items) {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

