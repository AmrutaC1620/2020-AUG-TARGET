package com.target.training.programs;

import com.target.training.entity.Employee;
import com.target.training.exceptions.EmptyNameException;
import com.target.training.exceptions.InvalidIdException;
import com.target.training.exceptions.InvalidSalaryException;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1;

        e1 = new Employee();
        try {
            e1.setId(7766);
            e1.setName("John Smith");
            e1.setSalary(1750);
        } catch (InvalidIdException e) {
            System.out.println("Invalid id supplied");
        } catch (EmptyNameException e) {
            System.out.println("Name seems to be empty or null");
        } catch (InvalidSalaryException e) {
            System.out.println("Something wrong with salary. Must be >= $1500.");
        }

        System.out.println("e1 is " + e1);

    }
}
