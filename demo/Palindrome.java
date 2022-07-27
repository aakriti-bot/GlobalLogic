package com.globallogic.demo;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		StringBuilder str = new StringBuilder();
		str.append(s);
		str.reverse();
		String rev=str.toString();
		if(s.equals(rev)){
			System.out.println("Palindrome");
		}
		else
		System.out.println("Not palindrome");
	}

}
