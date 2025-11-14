package fr.fms.marketplace;

import java.time.*;

public class Vegetable extends Product implements Consumable {

    public Vegetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays){
        super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
    }

    @Override
    public void calculateExpirationDate() {
        // create a clock
        ZoneId zid = ZoneId.of("Europe/Paris");

        // create an LocalDate object using now(zoneId)
        LocalDate lt = LocalDate.now(zid);

        // print result
        System.out.println("LocalDate : " + lt);
        System.out.println();
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
