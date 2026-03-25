
abstract class 도형{
	public abstract void draw();
}

class 사각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
		
	}
	
}

class 원 extends 도형{

	@Override
	public void draw() {
		System.out.println("원을 그린다.");
		
	}
	
}

abstract class DBDriver{
	public abstract void connection();
	public abstract void disConnection();
	
	public void preparedStatement() {
		System.out.println("SELECT 문장 전송 => 데이터 검색");
	};
	
	public void getResultSet() {
		System.out.println("읽은 데이터를 저장: 브라우저 전송");
	};
}

class Oracle extends DBDriver{

	@Override
	public void connection() {
		System.out.println("오라클 연결");
		
	}

	@Override
	public void disConnection() {
		System.out.println("오라클 닫기");
		
	}
}

class MySQL extends DBDriver{
	@Override
	public void connection() {
		System.out.println("MySQL 연결");
		
	}

	@Override
	public void disConnection() {
		System.out.println("MySQL 닫기");
		
	}
}

public class 추상클래스_1 {

	public static void main(String[] args) {
		도형 a = new 사각형();
		a.draw();
		
		a = new 원();
		a.draw();
		
		DBDriver db = new Oracle();
		db.connection();
		db.preparedStatement();
		db.getResultSet();
		db.disConnection();
		
		db = new MySQL();
		db.connection();
		db.preparedStatement();
		db.getResultSet();
		db.disConnection();

	}

}
