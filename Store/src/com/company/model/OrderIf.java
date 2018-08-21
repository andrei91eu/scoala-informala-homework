package com.company.model;

import java.util.Date;

public interface OrderIf {

    void setId(String id);

    String getId();

    void setDate(Date date);

    Date getDate();

    void setQuantity(int quantity);

    int getQuantity();

}
