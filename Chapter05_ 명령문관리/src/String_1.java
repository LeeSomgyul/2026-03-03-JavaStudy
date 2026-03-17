import java.util.*;

public class String_1 {

	public static void main(String[] args) {
		String[] subject = {
				"혼자 배우는 자바",
				"자바 AND Spring",
				"기본 자바"
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String fd = scan.next();
		
		System.out.print("시작하는 문자열 찾기: ");
		for(String data:subject) {
			if(data.startsWith(fd)) {
				System.out.print(data + ", ");
			}
		}
		System.out.println();
		System.out.print("끝나는 문자열 찾기: ");
		for(String data:subject) {
			if(data.endsWith(fd)) {
				System.out.print(data + ", ");
			}
		}
		System.out.println();
		System.out.print("포함된 문자열 찾기: ");
		for(String data:subject) {
			if(data.contains(fd)) {
				System.out.print(data + ", ");
			}
		}

	}

}
