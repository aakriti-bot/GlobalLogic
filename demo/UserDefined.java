package com.globallogic.demo;

enum Days {
	MON, TUE, WED, THU, FRI, SAT, SUN
}
class Employee
{

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	int id;
	String name;
	double salary;
}
//
public class UserDefined {
	
	public static final String MON="Monday";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
	
	System.out.println(Days.MON);
		System.out.println(Days.TUE);
		System.out.println("Value of " + Days.valueOf("MON"));
		

		System.out.println(Days.values());

		Days days[] = Days.values();
		// printing all the values
		for (Days d : days) {
			System.out.println(d);
		}
		

	}
}
