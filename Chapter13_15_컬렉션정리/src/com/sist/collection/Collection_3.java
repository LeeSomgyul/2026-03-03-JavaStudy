package com.sist.collection;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Collection_3 {
	
	public List<String> genieData(){
		List<String> list = new ArrayList<String>();
		
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			
			for(int i=0; i<title.size(); i++) {
				list.add(title.get(i).text());
			}
		}catch(Exception ex) {
			
		}
		
		return list;
	}
	
	public List<String> melonData(){
		List<String> list = new ArrayList<String>();
		
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			
			for(int i=0; i<title.size(); i++) {
				list.add(title.get(i).text());
			}
		}catch(Exception ex) {
			
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		Collection_3 co = new Collection_3();
		List<String> genie = co.genieData();
		System.out.println("===== 지니뮤직 =====");
		
		for(int i=0; i<genie.size(); i++) {
			System.out.println((i+1) + "." + genie.get(i));
		}
		
		List<String> melon = co.melonData();
		System.out.println("===== 멜론뮤직 =====");
		
		for(int i=0; i<melon.size(); i++) {
			System.out.println((i+1) + "." + melon.get(i));
		}
		
//		System.out.println("===== 지니뮤직에 있는 곡명 =====");
//		genie.removeAll(melon);
//		
//		for(int i=0; i<genie.size(); i++) {
//			System.out.println((i+1) + "." + genie.get(i));
//		}
		
//		System.out.println("===== 멜론뮤직에 있는 곡명 =====");
//		melon.removeAll(genie);
//		
//		for(int i=0; i<melon.size(); i++) {
//			System.out.println((i+1) + "." + melon.get(i));
//		}
//		
//		System.out.println("===== 공통으로 가지고 있는 곡명 =====");
//		genie.retainAll(melon);
//		System.out.println("공통 곡: " + genie.size());
//		for(int i=0; i<genie.size(); i++) {
//			System.out.println((i+1) + "." + genie.get(i));
//		}
		
//		List<String> list = new ArrayList<String>();
//		list.addAll(genie);
//		list.addAll(melon);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println((i+1) + "." + list.get(i));
//		}
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.addAll(genie);
		hashSet.addAll(melon);
		
		int i = 1;
		
		for(String h:hashSet) {
			System.out.println((i+1) + "." + h);
			i++;
		}
		
	}

}
