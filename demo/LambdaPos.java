package com.globallogic.demo;

//Lambda program to check positive or negative
interface Str{
	void string(String s);
}
interface Pos{
	void n(int a);
}
interface Root{
	double r(double x);
}
public class LambdaPos {
	public static void main(String[] args) {
		Pos p=(int a)->{
			if(a>=0)
			{
				System.out.println("Positive");
			}
			else
				System.out.println("Negative");
			
		};
		p.n(0);
		Str q=(String s)->{
			
			System.out.println(s.toUpperCase());
		};
		q.string("hello");
		Root rt= x-> Math.sqrt(x);
		System.out.println(rt.r(64));
	}

}
