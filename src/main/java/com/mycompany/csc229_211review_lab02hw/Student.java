package com.mycompany.csc229_211review_lab02hw;

// Student class that extends Person. Student extends Person that represents GPA and address

public class Student extends Person {

    private double gpa;
    private String address;

    // Constructor
    public Student(String name, int age) {
        super(name, (short) age); // age cast to short for Person class
    }

    // GPA getter
    public double getGpa() {
        return gpa;
    }

    //GPA setter

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Address getter
    @Override
    public String getAddress() {
        return address;
    }
 //Address setter
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // using toString method to print details about students
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge()
                + ", gpa=" + gpa + ", address='" + address + "'}";
    }
}


