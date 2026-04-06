import java.util.*;

public class Lambda_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		for(int i:list) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("==== 람다 사용 ====");
		
		list.stream().filter(x -> x%2 == 0).forEach(System.out::println);
	}

}
