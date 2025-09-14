package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @Prakash Pyakurel
 */
public class Student extends Person {

	private double gpa;

	private String address;

	public  Student(String name, int age) {
	super(name, (short) age); // cast age to short as required by the person

	}
	// getter for GPA

	public double getGPA() {
		return gpa;
	}

	//setter for GPA

	public void setGpa (double gpa) {
		this.gpa = gpa;
	}
		//now override 

	@Override 
	public String getAddress() {
		return address;
	}
			/**
     * Implementation of abstract setAddress() method from Person
     * 
     * @param address Address to set
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Overridden toString() method to print student information
     * 
     * @return Formatted student info string
     */
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge()
                + ", gpa=" + gpa + ", address='" + address + "'}";
    }
}
		
	
	
}
