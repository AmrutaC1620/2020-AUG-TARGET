package com.target.training.programs;

import com.target.training.entity.Shipper;
import com.target.training.service.ServiceException;
import com.target.training.service.ShipperManager;
import com.target.training.util.KeyboardUtil;

import java.util.List;

public class App {


    public static void main(String[] args) {
        new App().start();
    }

    private void line(char ch) {
        for(int i=0; i<80; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public void start() {
        // display menu

        theLoop:
        while(true) {
            line('=');
            System.out.println("0. Exit");
            System.out.println("1. Display all shippers");
            try {
                int choice = KeyboardUtil.getInt("Enter your choice: ");
                switch(choice) {
                    case 0:
                        break theLoop;
                    case 1:
                        displayAllShippers();
                        break;
                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid choice. Try again!");
            }
        }
        System.out.println("Thank you, have a nice day!");
    }

    private void displayAllShippers() {
        ShipperManager manager = new ShipperManager();
        try {
            List<Shipper> shippers = manager.getAllShippers();
            line('-');
            System.out.printf("%5s %-30s %-15s\n", "ID", "Company name", "Phone");
            line('-');
            for(Shipper s: shippers) {
                System.out.printf("%5d %-30s %-15s\n", s.getShipperId(), s.getCompanyName(), s.getPhone());
            }
        } catch (ServiceException e) {
            System.out.println("Something went wrong!");
            System.out.println(e.getMessage());
        }
    }
}
