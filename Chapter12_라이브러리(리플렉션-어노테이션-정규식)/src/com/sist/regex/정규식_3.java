package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 정규식_3 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4+404").get();
			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m = p.matcher(doc.toString());
			
			while(m.find()) {
				String s = m.group();
				s = s.substring(s.indexOf("=")+1, s.lastIndexOf("\""));
				System.out.println(s);
			}
		}catch(Exception ex) {
			
		}
	}

}
