package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class integers {

	public static void main(String[] args) {
		// given a list of integers divided it into two lists one having
		//an even number and the other having an odd number
		
		int[] arr= {1,2,3,4,5,6,7,8};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		Map<Boolean,List<Integer>> Checkedlist = list.stream()
		.collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
		System.out.println(Checkedlist);
		}

}
