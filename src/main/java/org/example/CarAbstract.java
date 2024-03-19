package org.example;

public abstract class CarAbstract {
    String brand;
    String model;
    String licensePlate;
    /**
     * Calculates rental price for the car
     * @return sum of base price + extras
     * _requires_:no input value
     * _effect_: returns base price + added extras
     */
    public abstract int calculatePrice();
}
