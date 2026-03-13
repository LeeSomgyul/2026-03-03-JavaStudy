//<선택정렬>
//1. 탐색: 전체 숫자 중에서 가장 장은 숫자를 찾는다
//2. 교체: 찾은 가장 작은 숫자와 맨 앞의 숫자와 바꾼다(<-이건 오름차순의 경우)
//3. 반복: 반복하면서 정렬하면 끝!

public class SelectionSort_1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.print("정렬 전: ");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		//맨 뒤에 숫자는 비교할 필요가 없음(이미 다 해서)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				//if문의 > 또는 < 에 따라 내림차순, 오름차순이 결정된다
				if(arr[i] < arr[j]) {
					int temp = arr[i];//교환을 위한 임시변수 생성
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("\n정렬 후: ");
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}

}
