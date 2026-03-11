import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());//시험장의 개수
		int[] arr = new int[N]; //각 시험장별 응시자 수
		
		long result = 0;//필요한 총 감독관수(최소)
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());//총 감독관이 한 시험장에서 감시할 수 있는 응시자 수
		int C = Integer.parseInt(st.nextToken());//부 감독관이 한 시험장에서 감시할 수 있는 응시자 수
		
		for(int i=0; i<N; i++) {
			result++;
			int r = arr[i] - B;//응시자 수 - B의 남은 수
			
			if(r>0) {
				result += r / C;
				
				if(r%C >0) {
					result += 1;
				}
			}
		}
		
		System.out.println(result);
		
	}

}
