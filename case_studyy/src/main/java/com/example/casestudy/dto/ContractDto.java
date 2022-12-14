package com.example.casestudy.dto;

import java.sql.Date;

public interface ContractDto {

    public int getId();

    public Date getStartDate();

    public Date getEndDate();

    public Double getDeposit();

    public String getCustomerName();

    public String getFacility();

    public Double getTotalAmount();

    public String getEmployee();


}
