package com.sist.collection;

import java.util.*;

import javax.swing.JFrame;

public class Collection_2 extends JFrame{
	
	public static void print(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	

	public static void main(String[] args) {
		print(List.of("A", "B", "C"));
		print(List.of(1,2,3));
		

	}

}
