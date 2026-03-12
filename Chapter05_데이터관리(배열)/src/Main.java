import java.util.*;
import java.io.*;

public class Main {
	static int maxMoney = 0;
	static int N;
	static int[] T;
	static int[] P;
	

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());//총 근무 일수
		T = new int[N+1];//각 상담별 일자
		P = new int[N+1];//각 상담별 수익
		
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(1, 0);
		System.out.println(maxMoney);
		
	}
	
	static void dfs(int day, int money) {
		//쌓인 날짜 = 근무 가능한 날짜 하루 뒤라면 최대금액 누적~
		if(day == N+1) {
			maxMoney = Math.max(maxMoney, money);
			return;
		}
		
		//쌓인 날짜 > 근무 가능한 날짜 라면 무효!
		if(day > N+1) {
			return;
		}
		
		//쌓인 날짜 + 앞으로 건너뛸 날 > 근무 가능한 날짜 라면 이라는 상황을 미리 막아주기
		if(day + T[day] <= N+1) {
			dfs(day + T[day], money + P[day]);
		}else {
			//이전 if 문이 넘을 것 같으면 그 날자는 건너뛰고 다음으로~
			dfs(day+1, money);
		}
		
		//원래 가능한 날이지만 그냥 건너뛰고 다른날 일한다면?
		dfs(day+1, money);
	}
}
