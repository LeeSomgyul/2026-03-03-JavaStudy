import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		
		String hong = "홍길동";
		String shim = "심청이";
		String kim = "김두한";
		String lee = "이순신";
		String kang = "강감찬";
		
		String[] names = {hong, shim, kim, lee, kang};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println(Arrays.toString(names));
		
		names[0] = "박문수";
		System.out.println(Arrays.toString(names));
	}

}
