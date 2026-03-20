package com.sist.oop;

class Sawon2{
	private int sabun; //private: Sawon2 클래스에서만 사용 가능
	private String name;
	String dept; //부서명은 나만의 고유한게 아니기 때문에 default
	protected String job;
	public String loc;
	private long pay;
	
	//private 에 접근하기 위해 getter 및 setter 생성
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
	
}

public class 접근지정어_1 {

	public static void main(String[] args) {
		
		Sawon2 hong = new Sawon2();
		//private 는 접근 불가 (protected 는 범위상 현재는 가능)
		hong.dept = "개발부";
		hong.job = "사원";
		hong.loc = "제주";
		
		//private 는 getter 및 setter 메서드를 이용해서 접근해야 한다.
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		
		//캡슐화 (getter 및 setter 하면)
		System.out.println("이름: " + hong.getName());
		System.out.println("사번: " + hong.getSabun());
		System.out.println("연봉: " + hong.getPay());
		System.out.println("직위: " + hong.job);
		System.out.println("부서: " + hong.dept);
		System.out.println("지역: " + hong.loc);

	}

}
