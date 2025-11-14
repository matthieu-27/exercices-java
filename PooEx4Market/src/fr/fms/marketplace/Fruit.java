package fr.fms.marketplace;

import java.time.LocalDate;
import java.time.ZoneId;

public class Fruit extends Product implements Consumable{

    public Fruit(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays){
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
    }

    @Override
    public boolean isRipe() {
        return false;
    }

    @Override
    public boolean isExpired(LocalDate verificationDate) {
        return false;
    }

    @Override
    public long daysRemainingBeforeExpiration(LocalDate verificationDate) {
        return 0;
    }

    @Override
    public void calculateExpirationDate() {
        // create LocalDate object using now()
        LocalDate todayDate = LocalDate.now();

        // get object pickingDate and shelfLifeDays
        LocalDate productPickingDate = this.pickingDate;
        int productShelfLifeDays = this.shelfLifeDays;

        LocalDate productMaxDate = productPickingDate.plusDays((long) productShelfLifeDays);

        if(productMaxDate.isBefore(todayDate)){
            System.out.println("Produit périmé");
        } else if (productMaxDate.equals(todayDate)) {
            System.out.println("Dernier jour avant péremption");
        } else {
            System.out.println("Il reste " + todayDate.until(productMaxDate).getDays() +" jours avant péremption");
        }

    }
}
