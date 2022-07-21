package com.globallogic.demo;

public class MyByte {
	public static void main(String[] args) {
		byte b=10;
		
		Byte b1=new Byte(b);
		
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println("double value"+b1.doubleValue());
		
		System.out.println("float value "+b1.floatValue());
		Byte newb=new Byte((byte)11);
		
		Integer i=new Integer(11);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toString(b));
		
		System.out.println(Integer.max(10, 11));
		
		
		System.out.println(Integer.min(11, 10));

		System.out.println(i.compareTo(10));
		
		Character c=new Character('A');
		System.out.println(c.toLowerCase(c));
		System.out.println((int)c);
		
}
}