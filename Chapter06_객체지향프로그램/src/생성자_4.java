
class Member2{
	int mno;
	String name;
	String address;
	
	Member2(){
		mno = 1; 
		name = "홍길동";
		address = "서울시";
	}
	
	Member2(String name){
		this.name = name;
	}
	
	Member2(int mno, String name, String address){
		this.mno = mno;
		this.name = name;
		this.address = address;
	}
}

public class 생성자_4 {

	public static void main(String[] args) {
		
		Member2 m1 = new Member2();
		System.out.println("회원번호: " + m1.mno);
		System.out.println("이름: " + m1.name);
		System.out.println("주소: " + m1.address);
		
		Member2 m2 = new Member2("심청이");
		System.out.println("회원번호: " + m2.mno);
		System.out.println("이름: " + m2.name);
		System.out.println("주소: " + m2.address);
		
		Member2 m3 = new Member2(2, "홍길동","부산");
		
	}

}
