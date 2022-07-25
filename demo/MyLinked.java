package com.globallogic.demo;
import java.util.*;

class Student1 implements Comparable<Student1>{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Student1(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [Name:"+ name+" "+"Salary:"+ salary;
}
	@Override
	public int compareTo(Student1 o) {
		
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
public class MyLinked {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Student1> list=new LinkedList<>();
		System.out.println("1.Add employee to list");
		System.out.println("2.Delete employee from list");
		System.out.println("3.Search the employee name");
		System.out.println("4.Update the employee name");
		System.out.println("5.Sort the data of employee");
		System.out.println("6.Provide the sum of salary of employee");
		System.out.println("7.Search for highest paid salary");
		System.out.println("8.Search for minimum paid salary");
		while(true){
			System.out.print("Make your choice: ");  
            int ch = sc.nextInt();
            switch(ch){
            case 1:{
            	System.out.println("Enter name:");
            	String str=sc.next();
            	System.out.println("Enter salary:");
            	int d=sc.nextInt();
            	list.add(new Student1(str,d));
            	break;
            }
            case 2:
            {
            	System.out.println("Enter the name to be deleted");
            	String s=sc.next();
            	for (Student1 del : list) 
            	{
					if (del.getName().equalsIgnoreCase(s)) {

						list.remove(del);
					}
					System.out.println(list);

				}
				break;
            }
            case 3:{
            	System.out.println("Search the name");
            	String s=sc.next();
            	for (Student1 del : list) 
            	{
					if (del.getName().equalsIgnoreCase(s)) {

						System.out.println(del.toString());
					}
            	}
            	break;
            }
            case 4:{
            	System.out.println("The name to be updated");
            	String s=sc.next();
            	System.out.println("Updated name");
                String str=sc.next();
                for (Student1 del : list) {
					if (del.getName().equalsIgnoreCase(s)) {
						del.setName(str);
						System.out.println(list);

					}
				}
				break;
            	
            	}
            case 5:
            {
            	Collections.sort(list);
            	System.out.println(list);
            	break;
            }
            case 6:
            {
            	int sum=0;

				for (Student1 s : list) {
					sum+=s.getSalary();
				}
				System.out.println(sum);
				break;
            }
            case 7:
            {
            	int max= Integer.MIN_VALUE;

				for (Student1 s : list) {
					if (max< s.getSalary()) {
						max= s.getSalary();
					}
				}
				System.out.println(max);
				break;
            }
            case 8:
            {
            	int min= Integer.MAX_VALUE;

				for (Student1 s: list) {
					if (min> s.getSalary()) {
						min=s.getSalary();
					}
				}
				System.out.println(min);
				break;
            }
            default:
            {
				System.out.println("Invalid");
			}
            }
		}
		
	}

}
