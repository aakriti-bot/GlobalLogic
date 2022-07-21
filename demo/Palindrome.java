package com.globallogic.demo;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String s="aakriti";
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
