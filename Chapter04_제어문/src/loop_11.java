import javax.swing.JOptionPane;

public class loop_11 {

	public static void main(String[] args) {
		
		int i=1;
		do {
			System.out.println(i+" ");
			i++;
		}while(i<=10);
		System.out.println();
		
		char c = 'A';
		do {
			System.out.println(c + " ");
			c++;
		}while(c<='Z');
		System.out.println();
		
		c = '0';
		do {
			System.out.println(c + " ");
			c++;
		}while(c<='9');

		System.out.println();
		
		String s = JOptionPane.showInputDialog("문자열 입력");
		System.out.println("글자 수: " + s.length());
		
		int count = 0;
		i = 0;
		
		do {
			char d = s.charAt(i);
			if(d=='A' || d=='a') {
				count++;
			}
			i++;
		}while(i<s.length());
		
		System.out.println("A또는 a의 개수:" + count);
	}

}
