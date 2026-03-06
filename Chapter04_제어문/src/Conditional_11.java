
public class Conditional_11 {

	public static void main(String[] args) {
		
		int no = 89;
		char op = 'A';
		
		switch(no/10) {
		case 10:
		case 9:
			op = 'A';
			break;
		case 8:
			op = 'B';
			break;
		case 7:
			op = 'C';
			break;
		default:
			op = 'F';
		}
		
		System.out.println(op);
	}

}
