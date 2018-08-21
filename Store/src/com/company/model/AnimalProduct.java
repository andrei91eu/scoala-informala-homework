package com.company.model;

public class AnimalProduct extends Product implements AnimalProductIF {

    private double storageTemperature;

    @Override
    public double getStorageTemperature() {
        return this.storageTemperature;
    }

    @Override
    public void setStorageTemperature(double storageTemperature) {
        this.storageTemperature = storageTemperature;
    }
}
