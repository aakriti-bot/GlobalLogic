package com.globallogic.demo;
//create a lambda to print the sum of 1 to 100 number

interface Sum{
	void Print();
}
public class LambdaSum {
	public static void main(String[] args) {
		
		Sum s =()->{int t=0;
		for(int i=1;i<=100;i++)
	{
			
		t += i;
		
	}
		
		System.out.println(t);
	};
	s.Print();
		
	}

}
