import java.util.*;;

public class Stream_1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()
			.filter(n->n%2 == 0)
			.map(n->n*n)
			.forEach(System.out::println);
			
		for(int i:list) {
			if(i%2 == 0) {
				i = i*i;
				System.out.println(i);
			}
		}
		
		System.out.println("===== 문자열 대분자로 변환 =====");
		
		List<String> names = Arrays.asList("king", "scott", "clerk");
		names.stream()
			.map(name -> name.toUpperCase())
			.forEach(name -> System.out.println(name));;
	
		System.out.println("===== for =====");
		
		
	}

}
