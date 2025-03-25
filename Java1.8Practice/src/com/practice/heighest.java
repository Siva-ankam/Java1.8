package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class heighest {

	public static void main(String[] args) {
		// give a sentence find the world that has the 2nd heighest length
        String s = "i am learning stream api in java";
       String ans =  Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(ans);
	}

}
