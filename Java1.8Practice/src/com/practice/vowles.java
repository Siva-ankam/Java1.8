package com.practice;

import java.util.Arrays;

public class vowles {

	public static void main(String[] args) {
		// given sentence find the the words with a specified number of vowles
		//no.of vowles:2
		 String s = "I am learning Streams API in Java";
		 Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]", "").length()==2)
		 .forEach(System.out::println);

	}

}
