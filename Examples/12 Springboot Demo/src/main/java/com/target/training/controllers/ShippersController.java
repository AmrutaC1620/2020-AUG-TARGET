package com.target.training.controllers;

import com.target.training.entity.Shipper;
import com.target.training.service.ShipperManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shippers")
public class ShippersController {

    // this is a dependency of this class; spring can inject this dependency.
    // ask spring to assign (inject) an object of ShipperManager type
    @Autowired
    ShipperManager sm;

    @GetMapping(produces = "application/json")
    public List<Shipper> getShippersAsJson() {
        return sm.getAll();
    }
}
