package com.sist.inner;

import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class Movie{
	private String name;
	private String director;
	private String actor;
	private String genre;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}

class DataCollection{
	private static List<Movie> mList = new ArrayList<Movie>();
	
	static {
		try {
			Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
			String data = doc.toString();
			data = data.substring(data.indexOf("["),
					data.lastIndexOf("]") + 1);
			System.out.println(data);
			
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp.parse(data);
			System.out.println(arr);
			
			for(int i=0; i<arr.size(); i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				Movie m = new Movie();
				m.setName((String)obj.get("movieNm"));
				m.setDirector((String)obj.get("director"));
				m.setGenre((String)obj.get(""));
				m.setGrade((String)obj.get("watchGradeNm"));
				mList.add(m);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	class DataManager{
		public void moiveList() {
			mList.stream()
				.forEach(m->System.out.println(
						m.getName() + " "+m.getDirector() + " " + m.getGenre() + " " + m.getGrade()));
		}
	}
	
	public void movieList() {
		DataManager dm = new DataManager();
		
	}
}



public class 내부클래스_2 {

	public static void main(String[] args) {
		
		DataCollection dc = new DataCollection();

	}

}
