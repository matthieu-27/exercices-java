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
        // create a clock
        ZoneId zid = ZoneId.of("Europe/Paris");

        // create an LocalDate object using now(zoneId)
        LocalDate lt = LocalDate.now(zid);

        // print result
        System.out.println("LocalDate : " + lt);
        System.out.println();
    }
}
