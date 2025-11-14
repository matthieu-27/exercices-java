package fr.fms.marketplace;

import java.time.LocalDate;

public interface Consumable {
    boolean isRipe();
    boolean isExpired(LocalDate verificationDate);
    long daysRemainingBeforeExpiration(LocalDate verificationDate);
}
