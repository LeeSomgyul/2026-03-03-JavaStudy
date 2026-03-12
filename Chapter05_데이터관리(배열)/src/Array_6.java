
public class Array_6 {

	public static void main(String[] args) {
		
		char[] alpha = new char[10];
		
		System.out.println("생성된 메모리 개수: " + alpha.length);
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)((int)(Math.random()*26)+65);
		}
		
		for(char c:alpha) {
			System.out.println(c + " ");
		}

	}

}
