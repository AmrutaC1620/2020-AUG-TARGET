package com.target.training.entity;

import com.target.training.exceptions.EmptyNameException;
import com.target.training.exceptions.InvalidIdException;
import com.target.training.exceptions.InvalidSalaryException;

import javax.naming.InvalidNameException;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidIdException {
        if (id <= 0) {
            throw new InvalidIdException("ID of an employee must be > 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyNameException {
        if (name == null || name.trim().length() == 0) {
            throw new EmptyNameException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 1500) {
            throw new InvalidSalaryException("Salary must be >= $1500");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
