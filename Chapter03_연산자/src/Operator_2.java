
public class Operator_2 {

	public static void main(String[] args) {
		 
		boolean b = false;
		int i = 0;
		
		while(i<10) {
			b = !b;
			
			if(b == true) {
				System.out.println("사용자");
			}else {
				System.out.println("컴퓨터");
			}
			
			i++;
			
		}

	}

}
