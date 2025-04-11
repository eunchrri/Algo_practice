package algo_250411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_boj_1463_1로_만들기_이은채 {
	
	static Integer[] dp;	// 메모이제이션 할 배열
	
	static int recur(int N) {
		if (N == 1) return 0;
		
		// 이미 계산된 값이 있다면 리턴
		if (dp[N] != null) return dp[N];
		
		// 1. 6으로만 나누어지는 경우
		if (N % 6 == 0) {
			dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
		}
		
		// 2. 2로만 나누어지는 경우
		else if (N % 2 == 0) {
			dp[N] = Math.min(recur(N - 1), recur(N / 2)) + 1;
		}
		
		// 3. 3으로만 나누어지는 경우
		else if (N % 3 == 0) {
			dp[N] = Math.min(recur(N - 1), recur(N / 3)) + 1;
		}
		
		// 4. 2와 3으로 나누어지지 않는 경우
		else {
			dp[N] = recur(N - 1) + 1;
		}
		return dp[N];
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
		
		System.out.println(recur(N));
	}

}
