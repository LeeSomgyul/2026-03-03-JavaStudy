
public class loop_13 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i==5) break;//5출력하기 전에 멈춰버리기
			System.out.println(i + " ");
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i==5) continue; //5제외하고 6부터 다시 출력
			System.out.println(i + " ");
		}

	}

}
