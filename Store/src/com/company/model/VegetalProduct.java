package com.company.model;

import java.util.List;

public class VegetalProduct extends Product implements VegetalProductIF {

    private List<String> vitaminList;

    @Override
    public List<String> getVitaminList() {
        return this.vitaminList;
    }

    @Override
    public void setVitaminList(List<String> vitaminList) {
        this.vitaminList = vitaminList;
    }
}
