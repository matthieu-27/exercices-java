package fr.fms.marketplace;

import java.time.LocalDate;

public abstract class Product {

    protected String name;
    protected double unitPrice;
    protected String unit;
    protected double stockQuantity;
    protected LocalDate pickingDate;
    protected int shelfLifeDays;

    public Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays){
        this.name = name;
        this.unitPrice = unitPrice;
        this.unit = unit;
        this.stockQuantity = stockQuantity;
        this.pickingDate = pickingDate;
        this.shelfLifeDays = shelfLifeDays;
    }

   public abstract void calculateExpirationDate();

    static void buyProduct(Product product, double desiredQuantity) throws Exception{
        double productQuantity = product.stockQuantity;
        String name = product.name;
        if(desiredQuantity > productQuantity){
            throw new Exception("La quantité désirée n'est pas disponible");
        } else {
            product.stockQuantity = (productQuantity - desiredQuantity);
            System.out.println("-- Achat de " + desiredQuantity + " " + (desiredQuantity > 1 ?  name + "s" : name) + "---");
        }

    }
}
