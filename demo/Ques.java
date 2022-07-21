//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".

package com.globallogic.demo;
import java.util.*;
public class Ques {
	public static void main(String[] args) {
		String s="Hello, World";
		int i= -1;
		while ((i=s.indexOf('o', i+1)) != -1 ) {
            System.out.println(i);
          	}
 		System.out.println(s.indexOf(','));
	}

}
