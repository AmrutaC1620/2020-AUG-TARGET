package com.target.training.entity;

import lombok.Data;

@Data
public class Shipper {
    private int shipperId;
    private String companyName;
    private String phone;

    public Shipper(int shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }
}
