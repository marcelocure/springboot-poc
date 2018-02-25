package com.github.marcelocure.springbootpoc.model;

public class Order {
    private String id;
    private Float value;
    private String customerName;

    public Order(String id, Float value, String customerName) {
        this.id = id;
        this.value = value;
        this.customerName = customerName;
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
}
