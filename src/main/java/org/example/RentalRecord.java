package org.example;

public class RentalRecord {
    private CarAbstract car;
    private int rentalPeriod;
    private int rentalPrice;
    private String lessorName;

    public RentalRecord(CarAbstract car, int rentalPeriod, String lessorName){
        this.car = car;
        this.rentalPeriod = rentalPeriod;
        this.rentalPrice = car.calculatePrice();
        this.lessorName = lessorName;
    }
}
