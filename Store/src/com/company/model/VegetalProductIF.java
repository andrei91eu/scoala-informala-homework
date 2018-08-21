package com.company.model;

import java.util.List;

public interface VegetalProductIF extends ProductIF {

    List<String> getVitaminList();

    void setVitaminList(List<String> vitaminList);
}
