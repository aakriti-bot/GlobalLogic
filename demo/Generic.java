package com.globallogic.demo;

class Student$<A,B,C,D,E>{
	A id;
	B name;
	C location;
	D company;
	E salary;
	Student$(A id,B name,C location,D company,E salary){
		this.id=id;
		this.name=name;
		this.location=location;
		this.company=company;
		this.salary=salary;
	}
	public void print(){
		System.out.println("Id:"+ id);
		System.out.println("Name:"+ name);
		System.out.println("Location:"+ location);
		System.out.println("Company:"+ company);
		System.out.println("Salary:"+ salary);
	}
}
public class Generic {
	public static void main(String[] args) {
		Student$<String,String,String,String,String> s=new Student$<String,String,String,String,String>("2527102","Aakriti","Noida","GlobalLogic","40000");
		s.print();
	}

}
