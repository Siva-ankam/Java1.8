package com.practice;

import java.util.Arrays;

public class sum {

	public static void main(String[] args) {
		// given an array find the sum of unique elements
		
		int[] arr = {1,6,7,8,1,1,8,8,7};
		int ans= Arrays.stream(arr).distinct().sum();
		System.out.println(ans);

	}

}
