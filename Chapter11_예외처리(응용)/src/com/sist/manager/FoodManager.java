package com.sist.manager;

import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;

public class FoodManager implements Manager{
	
	public static FoodVO[] foods = new FoodVO[446];
	
	static {
		try {
			StringBuffer sb = new StringBuffer();
			
			int i = 0;
			FileReader in = new FileReader("c:\\javaDev\\food.txt");
			
			while((i=in.read())!=-1) {
				sb.append((char)i);
			}
			
			in.close();
			
			String[] datas = sb.toString().split("\n");
			int index = 0;
			
			for(String data:datas) {
				if(data.trim().equals("")) continue;
				
				String[] s = data.split("\\|");
				
				FoodVO vo = new FoodVO();
				vo.setNo(Integer.parseInt(s[0].trim()));
				vo.setName(s[1].trim());
				vo.setType(s[2].trim());
				vo.setPhone(s[3].trim());
				
				if(index < foods.length) {
					foods[index] = vo;
					index++;
				}
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public FoodVO[] food_list(int page) {
		
		
		int pagecnt = (page*10)-10; //시작위치
		int row = 10;
		int total = food_total();
		
		//맨 마지막 페이지 나머지 처리 
		if(total==page) {
			row = foods.length%10;
			if(row == 0) row = 10;
		}
		
		FoodVO[] food = new FoodVO[row];
		int j=0;
		
		for(int i=pagecnt; i<pagecnt + row; i++) {
			if(i < foods.length) {
				food[j] = foods[i];
				j++;
			}
		}
		
		
		
		return food;
	}

	@Override
	public FoodVO food_detail(int no) {
		
		for(FoodVO vo:foods) {
			if(vo != null) {
				if(vo.getNo() == no) {
					return vo;
				}
			}
		}
		
		return null;
	}

	@Override
	public FoodVO[] food_find(String type, String fd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodVO[] food_filter(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	//
	@Override
	public int food_total() {
		
		return (int)(Math.ceil(foods.length/12.0));
	}

}
