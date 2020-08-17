package com.target.training.programs;

import com.target.training.entity.Shipper;
import com.target.training.service.ServiceException;
import com.target.training.service.ShipperManager;
import com.target.training.util.KeyboardUtil;

import java.util.List;
import java.util.Map;

public class App {


    public static void main(String[] args) {
        new App().start();
    }

    private void line(char ch) {
        for (int i = 0; i < 80; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public void start() {
        // display menu

        theLoop:
        while (true) {
            line('=');
            System.out.println("0. Exit");
            System.out.println("1. Display all shippers");
            System.out.println("2. Add a new shipper record");
            System.out.println("3. Modify name/phone of a shipper");

            try {
                int choice = KeyboardUtil.getInt("Enter your choice: ");
                switch (choice) {
                    case 0:
                        break theLoop;
                    case 1:
                        displayAllShippers();
                        break;
                    case 2:
                        addNewShipperRecord();
                        break;
                    case 3:
                        modifyShipperData();
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

    private void modifyShipperData() {
        try {
            int id = KeyboardUtil.getInt("Enter shipper id: ");

            ShipperManager manager = new ShipperManager();
            Shipper shipper = manager.getShipper(id);

            if (shipper == null) {
                System.out.println("No shipper data found for id: " + id);
                return;
            }

            String input = KeyboardUtil.getString("Enter company name: (" + shipper.getCompanyName() + ") ");
            if (input.trim().length() > 0) {
                shipper.setCompanyName(input);
            }

            input = KeyboardUtil.getString("Enter phone number: (" + shipper.getPhone() + ") ");
            if (input.trim().length() > 0) {
                shipper.setPhone(input);
            }

            Map<String, String> errors = manager.updateShipper(shipper);
            if (errors != null) {
                System.out.println("Encountered with following error/s: ");
                for (String errMsg : errors.values()) {
                    System.out.println(errMsg);
                }
            } else {
                System.out.println("Data updated successfully");
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong!");
        }
    }

    private void addNewShipperRecord() {
        try {
            int shipperId = KeyboardUtil.getInt("Enter id           : ");
            String companyName = KeyboardUtil.getString("Enter company name : ");
            String phone = KeyboardUtil.getString("Enter phone number : ");

            Shipper shipper = new Shipper(shipperId, companyName, phone);
            ShipperManager manager = new ShipperManager();
            Map<String, String> errors = manager.addNewShipper(shipper);

            if (errors == null) {
                System.out.println("New shipper data added successfully!");
            } else {
                System.out.println("Following errors were encountered.");
                for (String errMsg : errors.values()) {
                    System.out.println(errMsg);
                }
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong! Mostly you entered invalid input.");
        }
    }


    private void displayAllShippers() {
        ShipperManager manager = new ShipperManager();
        try {
            List<Shipper> shippers = manager.getAllShippers();
            line('-');
            System.out.printf("%5s %-30s %-15s\n", "ID", "Company name", "Phone");
            line('-');
            for (Shipper s : shippers) {
                System.out.printf("%5d %-30s %-15s\n", s.getShipperId(), s.getCompanyName(), s.getPhone());
            }
        } catch (ServiceException e) {
            System.out.println("Something went wrong!");
            System.out.println(e.getMessage());
        }
    }
}
