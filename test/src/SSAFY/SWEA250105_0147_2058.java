package SSAFY;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라.
 *
 *
 * [제약 사항]
 *
 * 자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)
 *
 *
 * [입력]
 *
 * 입력으로 자연수 N이 주어진다.
 *
 *
 * [출력]
 *
 * 각 자릿수의 합을 출력한다.
 */
public class SWEA250105_0147_2058 {
	public static void main(String[] args){
		System.out.println("1부터 9999까지의 자연수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int userNum = sc.nextInt();

		System.out.println(intSum(userNum));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
	public static int intSum(int userNum) {
		String[] sNum = Integer.toString(userNum).split("");
		int sum = 0;
		for(String num : sNum){
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}