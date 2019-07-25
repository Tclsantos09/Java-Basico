package ex09_1_exercise;

public class Customer {
	public String name;
	public String ssn;
	
	public Customer(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String n) {
		name = n;
	}
	
	public String getSSN() {
		return ssn;
	}
}
