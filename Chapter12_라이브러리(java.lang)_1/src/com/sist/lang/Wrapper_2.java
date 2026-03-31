package com.sist.lang;

import java.util.*;

class Controller{
	public void aaa() {
		System.out.println("Controller:aaa() Call...");
	}
	
	public void bbb() {
		System.out.println("Controller:bbb() Call...");
	}
	
	public void ccc() {
		System.out.println("Controller:ccc() Call...");
	}
}

public class Wrapper_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		System.out.print("aaa(1), bbb(2), ccc(3): ");
		int no = scan.nextInt();
		
		if(no==1) {
			c.aaa();
		}else if(no == 2) {
			c.bbb();
		}else if(no == 3) {
			c.ccc();
		}
		
		
	}

}
