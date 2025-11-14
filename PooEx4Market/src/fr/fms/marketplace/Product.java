package fr.fms.marketplace;

import java.time.LocalDate;

public abstract class Product {

    public abstract void calculateExpirationDate();

    public Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays){
       super();
    }

    public void buyProduct(Product product, double quantity){

    }


}
