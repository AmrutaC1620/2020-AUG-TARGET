package com.target.training.programs;

import com.target.training.entity.Shipper;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> dept = new TreeMap<>();
        dept.put("physics", "Ramachandra");
        dept.put("maths", "Saroja");
        dept.put("electronics", "Krishna Murthy");
        dept.put("chemistry", "Nataraj");

        System.out.println(dept);

        for( Map.Entry<String, String> e: dept.entrySet()) {
            System.out.println(e.getKey() + " --> " + e.getValue());
        }

    }
    public static void main1(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("p1", "Vinod Kumar");
        map.put("sh001", new Shipper(1, "KVinod Transports", "973 1424 784"));
        map.put("today", new Date());
        map.put("p1", "Shyam Sundar");
        map.put("today", "1997-02-12");

        System.out.println(map);
    }
}
