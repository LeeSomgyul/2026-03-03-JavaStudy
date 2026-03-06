import java.util.*;

public class Conditional_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		
		String ch = scan.next();
		char c = ch.charAt(0);
		
		System.out.println("알파벳: " + c);
		
		if(c >= 'A' && c <='Z') System.out.println(c +"는(은) 대문자입니다.");
		if(c >= 'a' && c <= 'z') System.out.println(c + "는(은) 소문자입니다.");
		
	}

}
