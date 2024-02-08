package com.mycompany.csc229_211review_lab02hw;

//Main driver class to test the Student class.

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a new Student object
        Student std1 = new Student("Prakash Pyakurel", 30);

        // Ask user to enter GPA
        System.out.print("Enter GPA for " + std1.getName() + ": ");
        double gpa = input.nextDouble();
        std1.setGpa(gpa);

        // Ask user to enter Address
        input.nextLine(); // Clear newline from buffer
        System.out.print("Enter address for " + std1.getName() + ": ");
        String address = input.nextLine();
        std1.setAddress(address);

        // Print Student details
        System.out.println(std1);

        input.close();
    }
}
