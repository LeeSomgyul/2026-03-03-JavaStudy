
public class Array_3 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신", "강감찬", "박문수", "김두한"};
		String[] address = {"서울", "경기", "강원", "제주", "부산"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] = "(" + address[i] + ")");
		}
	}
}
