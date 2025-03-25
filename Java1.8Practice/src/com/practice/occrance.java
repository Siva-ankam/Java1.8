package com.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occrance {

	public static void main(String[] args) {
		// find the occurrence of each word
		
		String s = "I am learning Streams api in java java";
		Map<String,Long> ans = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(ans);
	}

}
