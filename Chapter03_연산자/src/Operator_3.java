
public class Operator_3 {

	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 78;
		int math = 87;
		
		int count = 3;
		
		int total = kor + eng + math;
		double avg = (double) total / count;
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("평균 = " + avg);
		
		char c = 6;
		System.out.println((int)c);
		
		int i = 65;
		System.out.println((char)i);
		
		int a = 123456;
		float d = 123456.78F;
		int r = (int)((d-a)*100);
		
		System.out.println(r);
		
	}
}
