package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class findsec {

	public static void main(String[] args) {
		// find the 2nd heighest length world ina sentence
		
		String s = "I am learning stream api in java";
		int ans = Arrays.stream(s.split(" ")).map(map ->map.length()).sorted(Comparator.reverseOrder())
		.skip(1).findFirst().get();
		System.out.println(ans);

	}

}
