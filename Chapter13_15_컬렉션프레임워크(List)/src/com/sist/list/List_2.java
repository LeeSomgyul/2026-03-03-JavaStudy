package com.sist.list;

import java.util.Arrays;
import java.util.*;

public class List_2 {

	public static void main(String[] args) {
		String[] arr = {"aaa","bbb","ccc"};
		List<String> list = Arrays.asList(arr);

		Set<String> set = new HashSet(list);
		
		for(String s:set) {
			System.out.println(s);
		}
	}

}
