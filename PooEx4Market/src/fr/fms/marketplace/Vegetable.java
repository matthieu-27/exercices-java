package fr.fms.marketplace;

import java.time.*;

public class Vegetable extends Product implements Consumable {
    private String name;
    private double unitPrice;
    private String unit;
    private LocalDate pickingDate;
    private int shelfLifeDays;

    public Vegetable(String name, double unitPrice, String unit, LocalDate pickingDate, int shelfLifeDays){
        this.name = name;
        this.unitPrice = unitPrice;
        this.unit = unit;
        this.pickingDate = pickingDate;
        this.shelfLifeDays = shelfLifeDays;
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
