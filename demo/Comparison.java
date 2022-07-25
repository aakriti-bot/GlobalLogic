package com.globallogic.demo;

import java.util.Comparator;

public class Comparison implements Comparator <Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary())
		{
			return -1;
		}
		else
		return 0;
	}
	

}
