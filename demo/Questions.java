//Write a program to print a string entered by user.
//Write a program to input and display the sentence I love candies.
//Write a program to find the length of the string "refrigerator".
//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
//Write a program to check if the word 'orange' is present in the "This is orange juice".
package com.globallogic.demo;
import java.util.Scanner;
public class Questions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		System.out.println(s);
		String s2="refrigerator";
		System.out.println(s2.length());
		String s3="Umbrella";
		System.out.println(s3.contains("e"));
		String s4="This is orange juice";
		System.out.println(s4.contains("orange"));
		System.out.println("Enter the sentence:");
		String s1[]=new String[3];
		for(int i=0; i<s1.length;i++){	
		s1[i]=sc.next();
		System.out.print(s1[i]+" ");
		}
	
		
}
}