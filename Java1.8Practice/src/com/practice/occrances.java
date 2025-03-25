package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occrances {

	public static void main(String[] args) {
		// given a word find the occrance of each character
		String s = "Mississippi";
		//Map<String,Long> CharOccurance = Arrays.stream(s.split(""))
//.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		Map<String,Long> CharOccurance = Arrays.stream(s.split(""))
.collect(Collectors.groupingBy(x->x,Collectors.counting()));
						
System.out.println(CharOccurance);
	}

}
