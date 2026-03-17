
public class String_4 {

	public static void main(String[] args) {
		
		String color = "red, green, blue, yello, black, magenta, pink";
		String[] colors = color.split(",");
		
		for(String c:colors) {
			System.out.println(c);
		}
		
		// "|"는 정규식이기 때문에 저 문자를 기준으로 자르기 위해서는 \\를 앞에 붙여야 한다.
		color = "red|green|blue|yello|black|magenta|pink";
		String[] colors2 = color.split("\\|");
		for(String c:colors2) {
			System.out.println(c);
		}
	}

}
