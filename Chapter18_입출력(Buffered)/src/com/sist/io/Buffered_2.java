package com.sist.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffered_2 {

	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("문자열 입력: ");
			String msg = in.readLine();
			System.out.println(msg);
		}catch(Exception ex) {}

	}

}
