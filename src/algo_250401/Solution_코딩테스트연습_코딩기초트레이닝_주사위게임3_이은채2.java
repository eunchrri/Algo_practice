package algo_250401;

import java.util.Scanner;

public class Solution_코딩테스트연습_코딩기초트레이닝_주사위게임3_이은채2 {
	/*
	 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
	 * 
	 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
	 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
	 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
	 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
	 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
	 * 
	 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때,
	 * 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
	 * 
	 * */
	public static void main(String[] args) {
		// 1. a, b, c, d 입력 받기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		int result = 0;
		// 2. 케이스 나누기
		// 2.1 네 주사위의 숫자가 모드 같은 경우
		if ((a == b) & (a == c) & (a == d) & (b == c) & (b == d) & (c == d)) {
			result = a * 1111;
		} else if ((a == b) & (c == d) & (a != c)) {
			result = (a + c) * Math.abs(a - c);
		} else if ((a == b) & (a != c) & (a != d) ) {
			result = c * d;
		} else if ((a != b) & (a != c) & (a != d) & (b != c) & (b != d) & (c != d)) {
			result = Math.min(Math.min(a, b), Math.min(c, d));
		}
		
		System.out.println(result);
	}

}
