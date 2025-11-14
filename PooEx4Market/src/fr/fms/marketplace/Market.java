package fr.fms.marketplace;

import java.time.LocalDate;

public class Market {
    public static void main(String[] args) {
        Vegetable tomate = new Vegetable("Tomate", 10, "kg", 30, LocalDate.now(), 30);
        Fruit fraise = new Fruit("Fraise", 10, "kg", 30, LocalDate.now(), 30);
        try {
            tomate.buyProduct(tomate, 5);
            tomate.buyProduct(tomate, 35);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
