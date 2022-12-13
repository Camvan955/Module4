package com.example.casestudy.dto;


import com.example.casestudy.model.FacitilyType;
import com.example.casestudy.model.RentType;

public interface FacilityView {

    int getId();

    String getName();

    String getFacilityTypeNames();

    String getRentNames();

    int getMaxPeople();

    FacitilyType getFacilityType();

    RentType getRentType();

    String getStandardRoom();

    String getDescriptionOtherConvenience();

    double getPoolArea();

    int getNumberOfFloors();

    String getFacilityFree();
}
