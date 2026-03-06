
public class Operator_15 {

	public static void main(String[] args) {
		
//		int num = (int)(Math.random()*100)+1;
//		
//		System.out.println("num = " + num);
//		
//		String result = num%2==0 ? "짝수" : "홀수";
//		System.out.println(num + "는(은)" + result + "입니다.");
//		
//		int num2 = (int)(Math.random() * 2);
//		char c = num2==0 ? (char)((int)(Math.random() * 26) + 65): (char)((int)(Math.random() * 26) + 97);
//		
//		System.out.println("c = " + c);		
//		
//		String result2 = (c>='A' && c<='Z') ? "대문자" : "소문자";
//		System.out.println(c + "는(은)" + result2 + "입니다");
		
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		
		int max = num1<num2?num2:num1;
		int min = num1<num2?num1:num2;
		
		System.out.println(num1 + "," + num2);
		System.out.println("큰수: " + max);
		System.out.println("작은수: " + min);
		
		String result = num3%3 == 0 ? "3의배수입니다." : "3의배수가 아닙니다.";
		System.out.println(num3 + "는(은)" + result);
	}
}
