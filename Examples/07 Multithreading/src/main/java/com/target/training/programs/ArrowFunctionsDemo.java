package com.target.training.programs;

import com.target.training.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrowFunctionsDemo {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(5, "Toshiba Travelmate", 28000, 3));
        products.add(new Product(3, "Redmi Notebook", 56000, 20));
        products.add(new Product(4, "Apple Macbook Pro", 128500, 6));
        products.add(new Product(2, "HP Pavilion", 92000, 5));
        products.add(new Product(1, "Lenovo Laptop", 78200, 12));

        // print(products);

        List<String> names = new ArrayList<>();
        names.add("Vinod");
        names.add("Vinay");
        names.add("Ramesh");
        names.add("Anil");
        names.add("Sujay");

        print(products);
        Collections.sort(products);
        print(products);

        // whenever you need an object of a functional interface, you can supply an arrow function,
        // representing the body for that abstract function in the interface

        // sort products based on price
        Collections.sort(products, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        print(products);

        // sort products based on name
        Collections.sort(products, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        print(products);

        // sort products based on unitsInStock
        Collections.sort(products, (p1, p2) -> p2.getUnitsInStock() - p1.getUnitsInStock());
        print(products);

        System.out.println("vinod".compareTo("vinod"));
    }

    static void print(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println();
    }
}
