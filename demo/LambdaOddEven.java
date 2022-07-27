package com.globallogic.demo;

//Create a lambda to find the even and odd value
//create a lambda to find the largest number
//create a lambda to find the min  number
//create a lambda to print the hello world

interface Check{
	void check(int a);
}
interface Greater{
	void num(int b,int c);
}
interface Print{
	void print();
}
public class LambdaOddEven {
	public static void main(String[] args) {
		Print hello=()->{System.out.println("Hello World");};
		hello.print();
		Check n=(int a) ->
		{
			if(a%2==0)
			{
				System.out.println("Number "+ a+ " is even");
			}
			else
				System.out.println("Number "+ a+ " is odd");
		};
		n.check(5);
		n.check(8);
		Greater g=(int b,int c)->{
			
			System.out.println("Greater value: "+Integer.max(b,c));
			System.out.println("Smaller value: "+Integer.min(b,c));
			
		};
		g.num(20, 40);
		g.num(45, 76);
		
	}

}
