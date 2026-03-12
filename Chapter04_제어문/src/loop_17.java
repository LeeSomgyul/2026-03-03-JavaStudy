
public class loop_17 {

	public static void main(String[] args) throws Exception{
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=6; i++) {
//			int lotto = (int)(Math.random()*45)+1;
//			Thread.sleep(1000);
//			System.out.print(lotto + " ");
//		}
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
