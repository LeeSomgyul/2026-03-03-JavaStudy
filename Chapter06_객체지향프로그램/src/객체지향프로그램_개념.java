import lombok.Data;

@Data
class Student2{
	private String name;
	private int score;
}


public class 객체지향프로그램_개념 {

	public static void main(String[] args) {
		
		Student2 st1 = new Student2();
		Student2 st2 = new Student2();
		Student2 st3 = new Student2();
		
		System.out.println("sa1=" + st1);
		System.out.println("sa2=" + st2);
		System.out.println("sa3=" + st3);
		
	}

}
