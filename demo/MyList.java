//Create List of Student and perform the below operation : 
//Add the data ,delete ,update ,remove , sort the list and print

package com.globallogic.demo;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Aakriti");
		list.add("Sakshi");
		list.add("Mannu");
		list.add("Shephali");
		list.add("Anshika");
		list.add("Neha");
		System.out.println(list);
		list.remove("Neha");
		list.set(2, "Himani");
		Collections.sort(list);
		System.out.println(list);
		list.clear();
	}

}
