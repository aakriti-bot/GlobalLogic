package com.globallogic.demo;
import java.util.*;
public class MyIterator {
 public static void main(String[] args) {
	 ArrayList<String> ls = new ArrayList<String>();
		
		ls.add("himani");
		ls.add("akki");
		ls.add("sejal");
		ls.add("mansi");
		
		ListIterator<String > it=  ls.listIterator();
		Collections.sort(ls);
		
		
		while(it.hasNext())
		{
			
			System.out.println("element is "+it.next());
}
}

}
