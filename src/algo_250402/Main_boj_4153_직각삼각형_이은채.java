package algo_250402;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_boj_4153_직각삼각형_이은채 {
	/*
	 * 주어진 세 변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
	 * */
	public static void main(String[] args) {
		// 1. 세 변 입력받기
		Scanner sc = new Scanner(System.in);
		List<String> results = new ArrayList<>();
		
		// 1.1 세 변 arr에 저장
		while (true) {
			int[] arr = new int[3];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			
			// 1.2 입력 종료 조건
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			
			// 2. 오름차순으로 정렬
			Arrays.sort(arr);
			
			// 3. 피타고라스 조건에 따라 출력되도록
			if (arr[2]*arr[2] == arr[0]*arr[0] + arr[1]*arr[1]) {
				results.add("right");
			} else {
				results.add("wrong");
			}		
		}
		
		// 4. 입력이 끝난 후 한 번에 출력
		for (String result : results) {
			System.out.println(result);
		}
		sc.close();
	}

}
