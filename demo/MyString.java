package com.globallogic.demo;

public class MyString {
	public static void main(String[] args) {
		String str="Aakriti";
		String s1="Aakriti";
		String s2=new String("Aakriti");
		String s3=new String("Aakriti");
		System.out.println(str==s1);
		System.out.println(str==s2);
		System.out.println(s2==s3);
		System.out.println(str.equals(s1));
		System.out.println(s2.equals(s3));
		System.out.println(str.charAt(4));
		char sc[]=str.toCharArray();
		for(char ch:sc){
			System.out.println(ch);
		}
	}

}
