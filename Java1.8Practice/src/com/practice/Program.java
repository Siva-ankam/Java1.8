package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class Program {

	public static void main(String[] args) {
    
		//give a sentence find the world that has the highest length.
		//i/p=String s = "Iam learning Stream Api in Java
		//o/p = learning
		
		String s = "I am learning Stream Api in Java";
		String ans=Arrays.stream(s.split(" "))
				.max(Comparator.comparing(String::length)).get();
		System.out.println(ans);
		
		

	}

}
