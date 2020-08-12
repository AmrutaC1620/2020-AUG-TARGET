package com.target.training.entity;

public class Customer extends Person {
    private int id;
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(int id, String name, String email, String phone, CustomerType customerType) {
        super(name, email, phone);
        this.id = id;
        this.customerType = customerType;
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
    public void print() {
        System.out.println("ID      : " + id);
        super.print();
        System.out.println("Type    : " + customerType);
        System.out.println("---------------------------------");
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
