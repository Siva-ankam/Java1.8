package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class rearrange {

	public static void main(String[] args) {
		// given an int[] array,re arrange the elements to from the
		//highest/lowest possible value
		
		int[] arr = {1,2,3,4,5};
		//Arrays.stream(arr).mapToObj(x->x).sorted().forEach(System.out::println);
		
		Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	

}
