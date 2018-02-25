package com.github.marcelocure.springbootpoc.v1.model;

public class Order {
    private String id;
    private Float value;
    private String customerName;
    private String location;

    public Order(String id, Float value, String customerName, String location) {
        this.id = id;
        this.value = value;
        this.customerName = customerName;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
