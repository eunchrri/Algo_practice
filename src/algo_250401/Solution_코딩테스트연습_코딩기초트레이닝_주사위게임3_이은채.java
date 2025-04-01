package algo_250401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution_코딩테스트연습_코딩기초트레이닝_주사위게임3_이은채 {
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
		
		//System.out.println(solution(a, b, c, d));
	}
	
	/*public static int solution(int a, int b, int c, int d) {
		int[] dice = {a, b, c, d};
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int num : dice) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int size = map.size();
		
		if (size == 1) {
			return 1111 * a;
		} else if (size == 2) {
			for (int key : map.keySet()) {
				int count = map.get(key);
				if (count == 3) {
					int other = 0;
					for (int  k : map.keySet()) {
						if (k != key) other = k;
					}
					return (int)Math.pow(10 * key + other, 2);
				} else if (count == 2) {
					Iterator<Integer> iter = map.keySet().iterator();
					int p = iter.next();
					int q = iter.next();
					return (p+q) * Math.abs(p-q);
				}
			}
		} else if (size == 3) {
			int two = 0, one1 = 0, one2 = 0;
			for (int key : map.keySet()) {
				int count = map.get(key);
				if (count == 2) two = key;
				else {
					if (one1 == 0) one1 = key;
					else one2 = key;
				}
			}
			return one1 * one2;
		} else {
			return Math.min(Math.min(a, b), Math.min(c, d));
		}
	}*/

}
