package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

class MyException{
	public void aaa() {
		System.out.println("MyException: aaa() Call");
	}
	
	public void bbb() {
		System.out.println("MyException: bbb() Call");
	}
	
	public void ccc() {
		System.out.println("MyException: ccc() Call");
	}
}

public class 예외처리_1 {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("입력으로 aaa 또는 bbb 또는 ccc을 하세요: ");
			
			String m = scan.next();
			Class className = Class.forName("com.sist.exception.MyException");
			Object obj = className.getDeclaredConstructor(null).newInstance();
			Method[] methods = className.getDeclaredMethods();
			
			for(Method mm:methods) {
				if(mm.getName().endsWith(m)) {
					mm.invoke(obj, null);
				}
			}
		}catch(Exception ex) {
			
		}
	}

}
