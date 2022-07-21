package com.globallogic.demo;
import java.util.Scanner;
class Kids
{
	public Kids(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + "";
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
	int id;
	String name;
	
}

public class ArrayOfObject {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		//create the array with integer type
		Kids[] list=new Kids[10];
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Student data :");
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter Name");
			String name=sc.next();
			
			
			Kids student=new Kids(id, name);
			list[i]=student;
		}
		
		for(Kids st:list)
		{
			System.out.println(st);
		}
		
		
	}

}
