package com.demo.uppgifter;

import com.demo.uppgifter.checkout.Discount;
import com.demo.uppgifter.checkout.Item;
import com.demo.uppgifter.checkout.TenPercentDiscount;

public class Main {
    public static void main(String[] args) {

            Item item1 = new Item("Laptop", 1000, 1);
            Item item2 = new Item("Phone", 500, 2);

            double totalBeforeDiscount = calculateTotalPrice(item1, item2);
            System.out.println("total before discount: " + totalBeforeDiscount);

            Discount discount = new TenPercentDiscount();
            double totalAfterDiscount = discount.applyDiscount(totalBeforeDiscount);
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

