package com.target.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="shippers")
public class Shipper {
    @Id
    @Column(name="shipper_id")
    private Integer shipperId;
    @Column(name="company_name")
    private String companyName;
    private String phone;
}
