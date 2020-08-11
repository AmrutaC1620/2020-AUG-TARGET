package com.target.training.programs;

import com.target.training.entity.Customer;
import com.target.training.entity.CustomerType;

public class CustomerDemo {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setId(2123);
        c1.setName("Ramesh");
        c1.setEmail("ramesh@exmaple.com");
        c1.setPhone("9484422234");
        c1.setCustomerType(CustomerType.PREMIUM);

        System.out.println(c1);

    }
}
