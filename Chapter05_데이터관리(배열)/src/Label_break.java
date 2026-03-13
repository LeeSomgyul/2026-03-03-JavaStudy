
public class Label_break {

	public static void main(String[] args) {
		
		aaa:
		for(int i=1; i<=3; i++) {
			for(int k=1; k<=3; k++) {
				if(k==2) break;//바로 위 for 문만 제어한다(즉, 첫번재 for 문은 정상 작동)
				System.out.println("i=" + i + ", k=" + k);
			}
			
			for(int j=1; j<=3; j++) {
				if(j==2) break aaa;//aaa 라고 라벨붙여 놓은 곳까지 break 작동한다
				System.out.println("i=" + i + ", j=" + j);
			}
		}

	}

}
