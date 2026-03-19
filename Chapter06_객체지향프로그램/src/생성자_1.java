import java.io.*;

class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	{
		try {
			FileReader in = new FileReader("C:\\javaDev\\sawon.txt");
			
			int i=0;
			String result = "";
			while((i=in.read())!=-1) {
				result += (char)i;
			}
			in.close();
			
			String[] info = result.split("\\|");
			sabun = Integer.parseInt(info[0]);
			
			name = info[1];
			dept = info[2];
			job = info[3];
			loc = info[4];
		}catch(Exception ex) {
			
		}
	}
}

public class 생성자_1 {

	public static void main(String[] args) {
		Sawon s1 = new Sawon();
		System.out.println("데이터 저장된 위치: " + s1);
		System.out.println("사번: " + s1.sabun);
		System.out.println("부서: " + s1.dept);
		System.out.println("직업: " + s1.job);
		System.out.println("지역: " + s1.loc);
		System.out.println("직업: " + s1.job);
	}

}
