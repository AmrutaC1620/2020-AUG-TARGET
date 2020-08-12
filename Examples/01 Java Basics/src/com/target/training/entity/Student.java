package com.target.training.entity;

public class Student extends Person {

    private int rollno;
    private double gpa; // 0 to 5

    public Student() {
        // implicitly invokes the superclass default no-arg constructor
    }

    public Student(int rollno, String name, String email, String phone, double gpa) {
        super(name, email, phone);
        this.rollno = rollno;
        this.gpa = gpa;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void print() {
        System.out.println("Roll no : " + rollno);
        super.print();
        System.out.println("GPA     : " + gpa);
        System.out.println("----------------------------------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", " + super.toString() +
                ", gpa=" + gpa +
                '}';
    }
}
