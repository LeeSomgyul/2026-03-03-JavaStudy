
public class Operator_6 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		int c = (int)(Math.random()*100)+1;
		int d = (int)(Math.random()*100)+1;
		int e = (int)(Math.random()*100)+1;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		double res = (a+b+c+d+e) / 5.0;
		
		System.out.println("결과값: " + res);

	}

}
