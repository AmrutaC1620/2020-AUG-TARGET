package com.target.training.service;

import com.target.training.entity.Shipper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// We can make this class as a spring component by decorating this class with one of:
// @Component / @Service / @Repository / @Controller / @RestController / @Configuration
@Slf4j
@Service
public class ShipperManager {

    private List<Shipper> shippers = new ArrayList<>();

    public ShipperManager() {
        shippers.add(new Shipper(1, "Speedy Express", "(503) 555-9831"));
        shippers.add(new Shipper(2, "United Package", "(503) 555-3199"));
        shippers.add(new Shipper(3, "Federal Shipping", "(503) 555-9931"));
    }

    public List<Shipper> getAll() {
        return shippers;
    }

    public Shipper getById(int id) {
        return shippers.stream()
                .filter(s->s.getShipperId()==id)
                .findAny()
                .orElse(null);
    }

    public void addShipper(Shipper shipper) {
        Shipper s = this.getById(shipper.getShipperId());
        if(s==null){
            this.shippers.add(shipper);
        }
        else {
            throw new RuntimeException("Shipper ID already exists!");
        }

    }
}
