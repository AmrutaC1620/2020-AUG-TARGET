package com.target.training.entity;

public class Customer extends Person {
    private int id;
    private CustomerType customerType;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Person details=" + super.toString() +
                ", customerType=" + customerType +
                '}';
    }
}
