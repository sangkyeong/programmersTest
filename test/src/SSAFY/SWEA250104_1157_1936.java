package SSAFY;

import java.util.Scanner;

/**
 * A와 B가 가위바위보를 하였다.
 *
 * 가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.
 *
 * A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.
 *
 *
 *
 * [입력]
 *
 * 입력으로 A와 B가 무엇을 냈는지 빈 칸을 사이로 주어진다.
 *
 *
 *
 *
 * [출력]
 *
 * A가 이기면 A, B가 이기면 B를 출력한다.
 */
public class SWEA250104_1157_1936 {
	public static String solution(int a, int b) {
		switch (a - b) {
			case -2 :
				return "A";
			case 1 :
				return "A";
			case -1 :
				return "B";
			case 2 :
				return "B";
			default :
				return "해당 조건은 제외입니다. 다른 조건을 입력하세요.";
		}
	}

	public static void main(String[] args){
		System.out.println("가위1, 바위2, 보3 판단할 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();


		System.out.println(solution(a, b));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
