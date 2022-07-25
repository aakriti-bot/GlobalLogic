package com.globallogic.demo;
import java.util.*;
class Employee1 implements Comparator<Employee1>{
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
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
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
class SortById implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else if(o1.getId()<o2.getId())
		{
			return -1;
		}
		else
		return 0;
	}	
}
class SortByName implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub		
		return o1.name.compareTo(o2.name);
	}	
}
public class MySet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Employee1> set=new HashSet<>();
		System.out.println("1.Insert data");
		System.out.println("2.Delete data");
		System.out.println("3.Search name");
		System.out.println("4.Sort data");
		while(true){
			System.out.print("Make your choice: ");  
            int ch = sc.nextInt();
            switch(ch){
            case 1:{
            	System.out.println("Enter id:");
            	int i=sc.nextInt();
            	System.out.println("Enter name:");
            	String str=sc.next();
                set.add(new Employee1(i,str));
            	break;
            	}
            case 2:{
            	System.out.println("Enter the name to be removed");
            	String str=sc.next();
            	Iterator<Employee1> del=set.iterator();
            	while(del.hasNext()) 
            		
            	{
            		Employee1 value=del.next();
					if(value.getName().equals(str)){

						del.remove();
					}
					System.out.println(set);

				}
//            	for (Employee1 e:set) 
//            	{
//					if(e.getName().equals(str)){
//
//						set.remove(e);
//					}
//					System.out.println(set);
//
//				}
				break;
				
                  }
            case 3:{
            	System.out.println("Enter the name to be searched");
            	String str=sc.next();
            	for (Employee1 del : set) 
            	{
					if (del.getName().equalsIgnoreCase(str)) {

						System.out.println(del.toString());
					}

				}
            	break;
            	
            	   }
            case 4:{           	
            	List<Employee1> list = new ArrayList<Employee1>(set);
            	Collections.sort(list, new SortByName());
            	System.out.println(list);
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


