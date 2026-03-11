import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class loop_10 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		
		String baseurl = "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=";
		String url = "";
		
		
		System.out.println("🎶🎶🎶 지니뮤직 🎶🎶🎶");
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 가요");
			System.out.println("2. 트롯");
			System.out.println("3. OST");
			System.out.println("4. POP");
			System.out.println("5. ZAZZ");
			System.out.println("6. CLASSIC");
			System.out.println("7. 종료");
			System.out.println("===============");
			
			System.out.print("메뉴를 선택하세요: ");
			int menu = scan.nextInt();
			
			if(menu<1 || menu>7) {
				System.out.println("1~7메뉴를 다시 입력하세요.");
				continue;
			}
			
			if(menu == 1) {
				System.out.println("===== 가요 =====");
				url = "M0100";
			}else if(menu == 2) {
				System.out.println("===== 트롯 =====");
				url = "M0107";
			}else if(menu == 3) {
				System.out.println("===== OST =====");
				url = "M0300";
			}else if(menu == 4) {
				System.out.println("===== POP =====");
				url = "M0200";
			}else if(menu == 5) {
				System.out.println("===== ZAZZ =====");
				url = "M0500";
			}else if(menu == 6) {
				System.out.println("===== CLASSIC =====");
				url = "M0600";
			}else if(menu==7) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println(baseurl+url);
			
			Document doc = Jsoup.connect(baseurl).get();
			
			Elements title = doc.select("table.list-wrap a.title");
			for(int i=0; i<title.size(); i++) {
				System.out.println((i+1)+"."+title.get(i).text());
			}
		}

	}

}
