import java.io.*;

public class loop_7 {

	public static void main(String[] args){
//		File file = new File("C:\\javaDev\\movie.txt");
//		FileReader fr = new FileReader(file);
//		StringBuffer db = new StringBuffer();
//		int i = 0;
//		while((i=fr.read())!=-1) {
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db);
		
		for(char c = 'A'; c<='Z'; c++) {
			System.out.println(c + " ");
		}
		
		char c = 'A';
		while(c<='Z') {
			System.out.println(c + " ");
			c++;
		}
		
		c = 'A';
		do {
			System.out.println(c+" ");
			c++;
		}while(c<='Z');
	}
}
