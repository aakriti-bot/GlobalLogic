package com.globallogic.demo;
import java.util.*;
interface Do{
	public int sum(int a, int b);

	
}

public class LambdaEx {
	public static void main(String[] args) {
		
		Do code=(a,b)->{return a+b;};
		System.out.println(code.sum(10, 20));
		
		
	}

}
