package com.company.model;

import java.util.Date;

public class Product implements ProductIF {

    private double price;
    private Date validityDate;
    private double weight;
    private String id;
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Date getValidityDate() {
        return this.validityDate;
    }

    @Override
    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
