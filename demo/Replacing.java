//Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat”with ”snow”, the new sentence should be printed as ”A snowman with snow”.
package com.globallogic.demo;
import java.util.*;
public class Replacing {
	public static void main(String[] args) {
		String str="A batman with bat";
		String s=str.replaceAll("bat","snow");
		System.out.println(s);
	}

}
