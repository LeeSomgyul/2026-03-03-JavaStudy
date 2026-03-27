package com.sist.commons;

import com.sist.vo.FoodVO;

public interface Manager {
	public FoodVO[] food_list(int page);
	public int food_total();
	public FoodVO food_detail(int no);
	public FoodVO[] food_find(String type, String fd);
	public FoodVO[] food_filter(int page);
}
