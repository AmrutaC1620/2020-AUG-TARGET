package com.target.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


// the url /api/hello is a resource, and has 2 representations
// 1. plain text (MIME type: text/plain)
// 2. json (MIME type: application/json)

@RestController
@RequestMapping("/api")
public class HelloController {

    // This function is called as "request handler"
    // DispatcherServlet checks with HandlerMapping object for a client
    // request called "/api/hello", and if found, will forward the request to
    // this function
    @GetMapping(value="/hello", produces = "text/plain")
    public String sayHello() {
        return "Hello, world!";
    }

    // @RequestMapping(value="/hello, produces="application/json", method=RequestMethod.GET)
    @GetMapping(value="/hello", produces = "application/json")
    public Map<String, Object> sayHelloAsJson() {
        Map<String, Object> map = new HashMap<>();

        map.put("message", "Hello, World!");
        map.put("from", "Vinod Kumar Kayartaya");
        map.put("timestamp", new Date());

        return map;
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring boot!";
    }
}
