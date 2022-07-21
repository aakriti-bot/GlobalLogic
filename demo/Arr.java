package com.globallogic.demo;
import java.util.Scanner;
class Student
{

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Student(int id, String name, double salary) {
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
public class Arr { 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	 
	 //index base 
	 arr[0]=1;
	 
	
System.out.println(arr[0]);
	 
	 System.out.println("Enter the Value of array");
	 
	 //reading the value from user 
	 for(int i=0;i<10;i++)
	 {
		//arr[i]=sc.nextInt(); 
	 }
	 
for(int i=0;i<10;i++)
	 {
		System.out.println("value is "+i +" "+arr[i]);
	 }
     
	 //second way
	 //size of array is given
	 int[] arr1=new int[10];
	 
	
	 
	 double[] d=new double[10];
	 
	 //what is size of this array
	 //it is always start with zero
	 int[] arr2 ={1,2,3,4,56,78,0};
	 
	
	 //array of string
	 String[] arrString=new String[10];
	 
	 
	 //array of object 
	 Student[] arrStu=new Student[3];
	 
System.out.println("Enter the employee data");
	 for(int i=0;i<3;i++)
	 {
		 int id=sc.nextInt();
		 String name=sc.next();
		 double salary=sc.nextDouble();
		 Student emp=new Student(id, name, salary);
		 arrStu[i]=emp;
		 
	 }

	 for(int i=0;i<arrStu.length;i++)
	 {
		 
	 }
	 //this is advance for loop
	 //

for(Student e:arrStu)
	 {
		 System.out.println(e);
	 }
}
}

