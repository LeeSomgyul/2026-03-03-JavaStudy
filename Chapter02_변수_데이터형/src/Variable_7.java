import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Variable_7 {

	public static void main(String[] args) {
		
		File f = new File("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\Variable_7.java");
		long fileType = f.lastModified();
		
		System.out.println(fileType);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(fileType)));

		String name = JOptionPane.showInputDialog("이름 입력: ");
		System.out.println(name);
		
		Random r = new Random();
		
		int kor = r.nextInt(101);
		int eng = r.nextInt(101);
		int math = r.nextInt(101);
		
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		
	}

}
