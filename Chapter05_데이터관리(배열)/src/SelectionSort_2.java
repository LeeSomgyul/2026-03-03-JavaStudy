
public class SelectionSort_2 {

	public static void main(String[] args) {
		
		char[] alpha = new char[5];
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char)((int)(Math.random()*26)+'A');
			
			//한 배열에 중복 없는 영어 만들기
			for(int j=0; j<i; j++) {
				if(alpha[i] == alpha[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("정렬 전: ");
		for(char c:alpha) {
			System.out.print(c + " ");
		}
		
		for(int i=0; i<alpha.length-1; i++) {
			for(int j=i+1; j<alpha.length; j++) {
				if(alpha[i] > alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("정렬 후: ");
		for(char c:alpha) {
			System.out.print(c + " ");
		}

	}

}
