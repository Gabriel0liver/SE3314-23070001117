package org.example;

public class LuxuryCar extends CarAbstract {
    public static final int BASE_PRICE = 100;
    public static final int GPS = 20;
    public static final int LEATHER_SEATS= 30;
    private boolean hasLeatherSeats;
    private boolean hasGPS;
    @Override
    public int calculatePrice() {
        int price = BASE_PRICE;
        if(hasGPS) price += GPS;
        if(hasLeatherSeats) price += LEATHER_SEATS;
        return price;
    }
}
