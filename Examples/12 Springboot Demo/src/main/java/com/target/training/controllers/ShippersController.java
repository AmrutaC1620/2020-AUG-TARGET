package com.target.training.controllers;

import com.target.training.entity.Shipper;
import com.target.training.entity.ShipperList;
import com.target.training.service.ShipperManager;
import org.apache.catalina.loader.ResourceEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping(produces = "application/xml")
    public ShipperList getShippersAsXml() {
        return new ShipperList(sm.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getShipperById(@PathVariable int id) {
        Shipper s = sm.getById(id);
        if (s == null) {
            return ResponseEntity.notFound().build();
            // throw new ShipperNotFoundException();
            // throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipper not found");
        } else {
            return ResponseEntity.ok(s);
        }
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No shipper data found for the given id.")
    class ShipperNotFoundException extends RuntimeException {
    }

    // Spring boot invokes this function, so the argument/s of this function are dependencies
    // that spring should inject. Spring boot can look into the request body and convert the same
    // into a shipper object using either JAXB or Jackson based on the value of header "Content-Type"
    @PostMapping(consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
    public ResponseEntity<?> addShipper(@RequestBody Shipper shipper) {
        try {
            this.sm.addShipper(shipper);
            return ResponseEntity.ok(shipper);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
