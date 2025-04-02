package algo_250402;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main_boj_30802_웰컴_키트_이은채 {
	/*
	 * 참가자들에게 티셔츠 한 장과 펜 한 자루가 포함된 웰컴 키트를 나눠줄 예정이다.
	 * 
	 * 웰컴키트 주문 조건
	 * 	티셔츠 : S, M, L, XL, XXL, XXXL => 총 6가지 사이즈, 티셔츠는 같은 사이즈의 T장 묶음으로만 주문할 수 있다.
	 * 	펜 : 한 종류, P 자루씩 묶음으로 주문하거나 한 자루씩 주문 가능
	 * 
	 * 총 N 명의 참가자 중 S, M, L, XL, XXL, XXXL 사이즈의 티셔츠를 신청한 사람은 각각 S, M, L, XL, XXL, XXXL 명이다.
	 * 	티셔츠는 남아도 되지만 부족해서는 안되고, 신청한 사이즈대로 나눠줘야 한다.
	 * 	펜은 남거나 부족해서는 안되고 정확히 참가자 수만큼 준비되어야 한다.
	 * 
	 * 티셔츠를 T 장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 P 자루씩 최대 몇 묶음 주문할 수 있고, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하시오.
	 * 
	 * 입:
	 * 	첫 줄: 참가자의 수 N
	 * 	둘째 줄: 티셔츠 사이즈별 신청자의 수 S, M, L, XL, XXL, XXXL이 공백으로 구분되어 주어짐.
	 * 	셋째 줄: 정수 티셔츠와 펜의 묶음 수를 의미하는 정수 T와 P가 공백으로 구분되어 주어짐.
	 * 
	 * */
	public static void main(String[] args) {
		// 1.1 참가자의 수 N 입력받기.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 1.2 t 사이즈별 신청자 수 입력받아 배열에 저장
		int[] t_order = new int[6];
		for (int i = 0; i < 6; i++) {
			t_order[i] = sc.nextInt();
		}
		
		// 1.3 T, P 입력받기
		int T = sc.nextInt();
		int P = sc.nextInt();
		
		sc.close();
		
		// 2. 티셔츠를 T 장씩 몇 묶음 주문해야 하는지 구하기
		// 2.1. t_order[i]를 오름차순 정리
		Arrays.sort(t_order);
		
		// 2.2. t_order[6] 보다 T가 크면 모두 6묶음 주문
		int t = 0;		// 티셔츠 최소 t 묶음 주문
		
		if (t_order[6] <= T) {
			t = 6;
			System.out.println(t);
		} else {
			// 2.3. t_order[6] 보다 T가 작으면 t_order[i]%T 가 있으면 (나머지가 있으면) t_order[i]/T + 1 
			for (int i = 0; i < 6; i++) {
				
			}
		}
		
		// 3. 볼펜을 p 자루씩 몇 묶음 주문해야 하는지 구하기
		
		
	}

}
