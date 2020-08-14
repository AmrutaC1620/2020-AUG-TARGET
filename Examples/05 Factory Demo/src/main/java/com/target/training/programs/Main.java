package com.target.training.programs;

import com.target.training.dao.DaoException;
import com.target.training.dao.DaoFactory;
import com.target.training.dao.ProductDao;
import com.target.training.util.KeyboardUtil;

public class Main {

    private ProductDao dao;

    public Main() {
        try {
            dao = DaoFactory.getProductDao();
        } catch (DaoException e) {
            System.out.println("OOPS! There was a problem while setting up the application. Please retry.");
            System.out.println("Here is the stack trace: ");
            e.printStackTrace();
        }
    }

    public void start() {
        while (true) {
            try {
                System.out.println("~~~ Main Menu ~~~");
                System.out.println("0. Exit");
                System.out.println("1. Get product by id");
                System.out.println("2. Add a new product");
                System.out.println("3. Find update product");
                System.out.println("4. Find and delete a product");
                // ... add more menu options
                int choice = KeyboardUtil.getInt("Enter your choice: ");

                if (choice == 0) {
                    System.out.println("Thanks for using our App. Have a nice day!");
                    break;
                }
                else {
                    switch (choice) {
                        case 1:
                            // call a function to get product and display
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a proper choice from the menu!");
                    }
                }



            } catch (Exception e) {
                // duck the exception, and re-display the menu
                System.out.println("Only numeric values are allowed! Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
