package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	public class DriverClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a new student with name and age
        Student std1 = new Student("Prakash", 30);

        // Set GPA using user input
        System.out.print("Enter GPA for " + std1.getName() + ": ");
        double gpa = input.nextDouble();
        std1.setGpa(gpa);

        // set the address
        input.nextLine(); // Consume newline
        System.out.print("Enter address for " + std1.getName() + ": ");
        String address = input.nextLine();
        std1.setAddress(address);

        // Print the student object
        System.out.println(std1);

        input.close();
    }
}
