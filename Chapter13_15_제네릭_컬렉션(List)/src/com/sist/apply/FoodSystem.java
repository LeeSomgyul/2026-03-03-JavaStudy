package com.sist.apply;


import java.io.FileReader;
import java.util.*;


public class FoodSystem {
	private static ArrayList<Food> fList = new ArrayList<Food>();
	static {
		try {
			FileReader fr = new FileReader("C:\\javaDev\\food.txt");
			int i=0;
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			String[] datas = sb.toString().split("\n");
			
			for(String food:datas) {
				Food f = new Food();
				StringTokenizer st = new StringTokenizer(food, "|");
			}
		}catch(Exception ex) {
			
		}
		
		
	}
}
