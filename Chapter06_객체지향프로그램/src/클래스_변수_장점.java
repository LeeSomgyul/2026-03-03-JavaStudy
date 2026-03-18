import java.util.*;

class Student{
	int kor, eng, math, total;
	double avg;
	char score;
	String name;
}

public class 클래스_변수_장점 {

	public static void main(String[] args) {
		
		Student[] std = new Student[3];//Student 객체 형태로 저장할 수 있는 공간 3개 마련하기 (아직 데이터는 없음)

		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			Student s = new Student();//객체 선언(선언 이후에 값 넣을 수 있음)
			
			//s 객체에다가 학생 정보 저장하기
			System.out.print("이름 입력: ");
			s.name= scan.next();
			
			System.out.print((i+1) + "번째 국어 점수: ");
			s.kor = scan.nextInt();
			
			System.out.print((i+1) + "번째 영어 점수: ");
			s.eng = scan.nextInt();
			
			System.out.print((i+1) + "번째 수학 점수: ");
			s.math = scan.nextInt();
			
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total/3.0;
			
			std[i] = s; //s 에 쌓아놓은 데이터들을 std 배열의 i 칸에 저장
		}
		
		for(Student ss:std) {
			System.out.printf("%5d%5d%5d%5d%7d%7.2f\n", ss.name, ss.kor, ss.eng, ss.math, ss.total, ss.avg);
		}
	}

}
