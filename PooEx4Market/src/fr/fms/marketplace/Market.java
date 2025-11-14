package fr.fms.marketplace;

import java.time.LocalDate;

public class Market {
    public static void main(String[] args) {
        Vegetable tomate = new Vegetable("Tomate", 10, "kg", 30, LocalDate.now().minusMonths((long) 1), 35);
        Fruit fraise = new Fruit("Fraise", 10, "kg", 30, LocalDate.now(), 30);
        try {
            Product.buyProduct(tomate, 5);
            Product.buyProduct(fraise, 1);
            Product.buyProduct(tomate, 35);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        tomate.calculateExpirationDate();
    }
}
