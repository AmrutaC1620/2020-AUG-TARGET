package com.target.training.entity;

public class Person {
    private String name;
    private String email;
    private String phone;
    private Gender gender = Gender.Male;

    // constructor:
    // 1. name is same as classname
    // 2. can be public/private/protected/package-level
    // 3. no return data type (not even void)
    // 4. cannot be invoked using a reference, like other methods
    // 5. automatically called when you create an object
    // 6. if no constructors are available, then compilers provides a default no-arg constructor
    // 7. adding a no-arg constructor is always considered as a good practice.
    // 8. more than one constructor (overloaded) may exist, but only one will be called.
    // 9. the only use of a constructor is to initialize member data during object creation
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // provides a textual representation of an object.
    // there is such function available already because of inheritance from Object.java
    // re-writing an inherited method is called as OVERRIDING

    public void print() {
        System.out.println("Name  = " + (gender == Gender.Female ? "Ms." : "Mr.") + name);
        System.out.println("Email = " + email);
        System.out.println("Phone = " + phone);
        System.out.println("----------------------------------");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
