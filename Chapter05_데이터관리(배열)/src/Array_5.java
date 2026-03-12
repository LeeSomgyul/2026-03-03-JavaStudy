
public class Array_5 {

	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300, 400, 500};
		int[] copy = arr;
		
		copy[0] = 1000;
		System.out.println(copy[0]);
		System.out.println("arr = " + arr);
		System.out.println("copy = " + copy);
		
		int[] copy2 = arr.clone();
		System.out.println("copy2 = " + copy2);

	}

}
