import java.util.*;

public class Collection_total_1 {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<String>();
//		set.add("1");
//		set.add("2");
//		set.add("3");
//		set.add("4");

		List<String> list = new ArrayList<String>(List.of("A", "B", "C", "D", "E"));
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("======= 역순 ========");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
