package beans;

public class Employee {
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		
	}
}
