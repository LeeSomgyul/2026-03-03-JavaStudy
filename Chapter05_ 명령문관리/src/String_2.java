import java.io.*;

public class String_2 {

	public static void main(String[] args) {

		File dir = new File("C:\\javaDev");
		File[] files = dir.listFiles();
		for(File file:files) {
			//파일만 출력 (폴더 x)
			if(file.isFile()) {
				String name = file.getName();
				String ext = name.substring(name.lastIndexOf(".")+1);
				System.out.println(ext);
			}
		}
		
		String msg = "Hello Java";
		System.out.println("a의 위치: " + msg.indexOf("a"));
		System.out.println("a의 위치: " + msg.lastIndexOf("a"));

	}

}
