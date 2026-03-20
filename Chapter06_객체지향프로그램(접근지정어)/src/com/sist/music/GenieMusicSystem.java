package com.sist.music;

import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//사용자의 요청에 맞게 기능을 만드는 곳 (거의 메소드로 이루어짐)
public class GenieMusicSystem {
	//Music 클래스를 세트로 50개 만들겠다는 의미 
	public static Music[] music = new Music[50];
	
	//초기화(static 이기 때문에 객체 생성 하지 않음), 자동으로 데이터 불러옴
	static {
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			Elements album = doc.select("table.list-wrap a.albumtitle");
			Elements etc = doc.select("table.list-wrap span.rank");
			
			for(int i=0; i<title.size(); i++) {
				Music m = new Music();
				m.setNo(i+1);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				
				String temp = etc.get(i).text();
				String state = "";
				String id = "";
				
				if(temp.equals("유지")) {
					state = "유지";
					id = "0";
				}else {
					state = temp.replaceAll("[^0-9]", "");//숫자만 남기기
					id = temp.replaceAll("[^가-힣]", "");//한글만 남기기
				}
				
				m.setState(state);
				m.setIdcrement(Integer.parseInt(id));
				
				music[i] = m;
			}
		}catch(Exception ex) {
			
		}
	}
	
	//기능 정의(메소드)
	//0.메뉴
	public int menu() {
		System.out.println("======= 메뉴 =======");
		System.out.println("1.음악목록");
		System.out.println("2.상세보기");
		System.out.println("3.곡명 검색");
		System.out.println("4.가수 검색");
		System.out.println("5.종료");
		System.out.println("===================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요: ");
		int m = scan.nextInt();
		return m;
	}
	
	//1.음악 목록 출력
	public void musicList() {
		for(Music m:music) {
			if(m!=null) {
				System.out.println(m.getNo() + "." + m.getTitle());
			}
		}
	}
	
	//2.상세보기
	public void musicDetail(int no) {
		for(Music m:music) {
			if(m.getNo() == no) {
				System.out.println("순위: " + m.getNo());
				System.out.println("곡명: " + m.getTitle());
				System.out.println("가수명: " + m.getSinger());
				System.out.println("앨범: " + m.getAlbum());
				System.out.println("상태: " + m.getState());
				
				String s = m.getState();
				if(s.equals("유지")) {
					System.out.println("등폭: - ");
				}else if(s.equals("상승")) {
					System.out.println("등폭: ▲ ");
				}else if(s.equals("하강")) {
					System.out.println("등폭: ▼ ");
				}
				
				break;
			}
		}
	}
	
	//3.검색 => 제목으로 찾기 
	public void titleFind(String findData) {
		for(Music m:music) {
			if(m!=null && m.getTitle().contains(findData)) {
				System.out.println(m.getNo() + "." + m.getTitle());
			}
		}
	}
	
	public void singerFind(String findData) {
		for(Music m:music) {
			if(m!=null && m.getSinger().contains(findData)) {
				System.out.println("노래명: " + m.getNo() + "." + m.getTitle());
				System.out.println("가수: " + m.getSinger());
			}
		}
	}
	
	//4.동영상
}
