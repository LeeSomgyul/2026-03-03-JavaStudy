
class Student3{
	int hakbun;
	String name;
	int kor, eng, math;
	
	//생성자 생성
	Student3(int hakbun, String name, int kor, int eng, int math){
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}

public class 생성자_3 {

	public static void main(String[] args) {

		Student3 hong = new Student3(1, "홍길동", 90, 90, 100);
		Student3 shim = new Student3(2, "심청이", 80, 60, 90);
		
		System.out.println(hong.hakbun + " " + hong.name + " " + hong.kor + " " + hong.eng + " " + hong.math);
	}

}
