
class Calculator{
	//1. 정적 메소드: 객체 생성하지 않아도 바로 호출 가능
	public static int add(int a, int b) {
		return a + b;
	}
	
	//2. 인스턴스 메소드: 객체 선언을 해준다음 사용 가능
	public void printWelcome() {
		System.out.println("계산기를 시작합니다!");
	}
}


public class 정적_인스턴스메소드 {

	public static void main(String[] args) {
		
		//1.정적 메소드 사용
		int result = Calculator.add(5, 2);
		System.out.println(result);
		
		//2.인스턴스 메소드 사용
		Calculator cal = new Calculator();
		cal.printWelcome();

	}

}
