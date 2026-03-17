import java.util.*;

public class 메소드분리_2 {

	static void menu() {
		System.out.println("========== 메뉴 ==========");
		System.out.println("1. 노래명");
		System.out.println("2. 가수명");
		System.out.println("3. 음악 앨범");
		System.out.println("4. 상세보기");
		System.out.println("5. 종료");
		System.out.println("=========================");
	}
	
	static void process() throws Exception {
		Scanner scan = new Scanner(System.in);
		while(true) {
			menu();
			System.out.print("메뉴 선택: ");
			int m = scan.nextInt();
			
			if(m==5) {
				System.out.println("프로그램 종료!!");
				break;
			}else if(m==1) {
				String[] title = GenieMusicData.getTitle();
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + "." + title[i]);
				}
			}else if(m==2) {
				String[] title = GenieMusicData.getSinger();
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + "." + title[i]);
				}
			}
			else if(m==3) {
				String[] title = GenieMusicData.getAlbum();
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + "." + title[i]);
				}
			}else if(m==4) {
				System.out.print("검색어: ");
				String fd = scan.next();
				String[] title = GenieMusicData.getFind(fd);
				for(int i=0; i<title.length; i++) {
					System.out.println((i+1) + "." + title[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		process();
	
	}

}
