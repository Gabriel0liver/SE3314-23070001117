package org.example;
public class EconomicalCar extends CarAbstract {
    public static final int BASE_PRICE = 50;
    public static final int HYBRID = 10;
    private boolean isHybrid;


    @Override
    public int calculatePrice() {
        int price = BASE_PRICE;
        if(isHybrid) price += HYBRID;
        return price;
    }
}