package com.sist.oop2;

import java.text.*;
import java.util.*;

class Temp{
	//가변 매개변수: int 형으로 값 개수 상관없이 넣어두 됨. 내부적으로는 [ ] 가 됨. 
	public void sum(int... value) {
		int s = 0;
		for(int i=0; i<value.length; i++) {
			s+=value[i];
		}
		System.out.println("sum = " + s);
	}
	
	public String change(int num) {
		DecimalFormat d = new DecimalFormat("###,###,###");
		return d.format(num);
		
	}
	
	public String dateChage(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
}

public class 메소드_1 {

	public static void main(String[] args) {
		
		Temp t = new Temp();
		t.sum(10);
		t.sum(10,20,30); //가변 매개변수 
		
		int a = 100000000;
		String res = t.change(a);
		System.out.println(res + "원");
		System.out.println(new Date());
	}

}
