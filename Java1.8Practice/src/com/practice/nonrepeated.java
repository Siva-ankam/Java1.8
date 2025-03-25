package com.practice;

import java.util.Arrays;

public class nonrepeated {

	public static void main(String[] args) {
		// given a string find the first non repeated charactr
		
		String s  = "Hello World";
		String ans = Arrays.stream(s.split(""))
				.filter(c->s.indexOf(c)==s.lastIndexOf(c))
				.findFirst().get();
 System.out.println(ans);
 
 int firstOcc = s.indexOf('l');
 int lastOcc = s.lastIndexOf('l');
 
 System.out.println(firstOcc+" "+lastOcc );
	}

}
