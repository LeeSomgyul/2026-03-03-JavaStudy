
public class Operator_1 {

	public static void main(String[] args) {
		
		int a = 10;//12
		int b = ++a + a++;//11 + 11
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c = 10;
		c++;
		c++;
		c++;
		c--;
		--c;
		c--;
		
		System.out.println("c = " + c);

	}

}
