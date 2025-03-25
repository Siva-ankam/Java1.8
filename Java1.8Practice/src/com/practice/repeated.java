package com.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class repeated {

	public static void main(String[] args) {
		// given a styring find the first repeated character
		
		String s = "Hellow World";
	Map<Character, Long> charMap = 	s.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charMap);
		
		char ans = s.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(m->m.getValue()>1)
		.map(m->m.getKey()).findFirst().get();	
		
		System.out.println(ans);
		

	}

}
