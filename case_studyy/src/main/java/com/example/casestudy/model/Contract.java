package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date startDate;
    private Date endDate;
    private Double deposite;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Facility facility;

    @ManyToOne
    private Customer customer;

    public Contract() {
    }

    public Contract(int id, Date startDate, Date endDate, Double deposite, Employee employee, Facility facility, Customer customer) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposite = deposite;
        this.employee = employee;
        this.facility = facility;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getDeposite() {
        return deposite;
    }

    public void setDeposite(Double deposite) {
        this.deposite = deposite;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
