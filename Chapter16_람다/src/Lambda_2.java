@FunctionalInterface
interface Calc{
	int calc(int a, int b);
	
}

public class Lambda_2 {

	public static void main(String[] args) {
		
		Calc add = (a,b) -> a+b;
		Calc minus = (a,b) -> a-b;
		Calc gop = (a,b) -> a*b;
		Calc div = (a,b) -> a/b;
		
		System.out.println(add.calc(10, 20));
		System.out.println(minus.calc(10, 20));
		System.out.println(gop.calc(10, 20));
		System.out.println(div.calc(10, 20));

	}

}
