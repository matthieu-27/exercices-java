package fr.fms.marketplace;

import java.time.*;

public class Vegetable extends Product implements Consumable {

    public Vegetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays){
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
    }

    @Override
    public void calculateExpirationDate() {
        // create LocalDate object using now()
        LocalDate todayDate = LocalDate.now();

        // get object pickingDate and shelfLifeDays
        LocalDate productPickingDate = this.pickingDate;
        int productShelfLifeDays = this.shelfLifeDays;

        LocalDate productMaxDate = productPickingDate.plusDays((long) productShelfLifeDays);
        int daysBeforeExpiration = todayDate.until(productMaxDate).getDays();
        if(productMaxDate.isBefore(todayDate)){
            System.out.println("Produit périmé");
        } else if (productMaxDate.equals(todayDate)) {
            System.out.println("Dernier jour avant péremption");
        } else {
            System.out.println(this.name + ": Il reste " + daysBeforeExpiration + (daysBeforeExpiration > 1 ? " jours" : " jour") +" avant péremption");
        }
    }

    @Override
    public boolean isExpired(LocalDate verificationDate) {
        return false;
    }

    @Override
    public boolean isRipe() {
        return false;
    }

    @Override
    public long daysRemainingBeforeExpiration(LocalDate verificationDate) {
        return 0;
    }
}
