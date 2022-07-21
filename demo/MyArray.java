package com.globallogic.demo;
class Stu {
	  
    public int id;
    public String name;
    Stu(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
 
    public void display()
    {
        System.out.println("Student id: " + id + " "+ "and Name is:"+" "+ name);
        //System.out.println();
    }
}
public class MyArray {
	public static void main(String args[])
    {
        Stu[] arr; 
        arr = new Stu[10];
        arr[0] = new Stu(2157102, "Aakriti");
        arr[1] = new Stu(2157101, "Aastha");
        arr[2] = new Stu(2157100, "Anshika");
        arr[3] = new Stu(2157103, "Himani");
        arr[4] = new Stu(2157104, "Janhavi");
        arr[5] = new Stu(2157105, "Mansi");
        arr[6] = new Stu(2157106, "Payal");
        arr[7] = new Stu(2157107, "Sakshi");
        arr[8] = new Stu(2157108, "Sejal");
        arr[9] = new Stu(2157109, "Shephali");
        arr[0].display();
        arr[1].display();
        arr[2].display();
        arr[3].display();
        arr[4].display();
        arr[5].display();
        arr[6].display();
        arr[7].display();
        arr[8].display();
        arr[9].display();
    }
}


