package fr.fms.marketplace;

import java.time.LocalDate;

public class Market {
    public static void main(String[] args) {
        Vegetable tomate = new Vegetable("Tomate", 10, "kg", LocalDate.now(), 30);
        Fruit fraise = new Fruit("Fraise", 10, "kg", LocalDate.now(), 30);
        tomate.calculateExpirationDate();
        fraise.calculateExpirationDate();
    }
}
