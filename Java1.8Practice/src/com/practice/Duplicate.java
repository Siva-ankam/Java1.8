package com.practice;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		//remove dublicates from the string and return in the same order
		//string s = "dabcadefg"
		//dabcefg
		
		String s = "dabcadefg";
		
	//s.chars().distinct().mapToObj(x ->(char)x).forEach(System.out::print);
     Arrays.stream(s.split("")).distinct().forEach(System.out::print);
     }

}
