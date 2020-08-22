package com.target.training.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // allow objects of this class to be marshalled as XML by JAXB
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Shipper {
    private int shipperId;
    private String companyName;
    private String phone;

    public Shipper() {
    }

    public Shipper(int shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }
}
