
import java.util.*;

interface I{
	int a = 100;
	void display();
	default void aaa() {
		
	}
}

interface II{
	public void display();
}

class A implements II{
	public void display() {
		
	}
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("심청이");
		
		for(String name:list) {
			System.out.println(name);
		}

	}

}
