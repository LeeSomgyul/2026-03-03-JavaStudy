package com.sist.lang;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizer_1 {

	public static void main(String[] args) {
		int[] reserve = new int[(int)(Math.random()*10)+6];
		for(int i=0; i<reserve.length; i++) {
			reserve[i] = (int)(Math.random()*31)+1;
			for(int j=0; j<i; j++) {
				if(reserve[i] == reserve[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(reserve);
		String s = "";
		for(int i:reserve) {
			s+=i+",";
		}
		s = s.substring(0, s.lastIndexOf(","));
		System.out.println(s);
		
		System.out.println("예약이 가능한 날");
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println("예약이 가능한 날은 몇일?" + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.err.println(st.nextToken());
		}

	}

}
