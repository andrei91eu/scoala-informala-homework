package com.company.model;

import java.util.Date;

public interface ProductIF {

    void setName(String name);

    String getName();

    double getPrice();

    void setPrice(double price);

    Date getValidityDate();

    void setValidityDate(Date validityDate);

    double getWeight();

    void setWeight(double weight);

    String getId();

    void setId(String id);
}
