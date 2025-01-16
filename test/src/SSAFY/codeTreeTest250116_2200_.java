package SSAFY;

import java.util.ArrayList;
import java.util.Scanner;

public class codeTreeTest250116_2200_ {
	public static String solution(int n, ArrayList<String> a) {
		String dir = "";
		String num = "";
		int x = 0;
		int y = 0;

		for(int i=0;i<a.size();i++) {
			String[] arr = a.get(i).split(" ");
			dir = arr[0];
			num = arr[1];
			if(dir.equals("N")){
				y += Integer.parseInt(num);
			}else if(dir.equals("S")){
				y -= Integer.parseInt(num);
			}else if(dir.equals("E")){
				x += Integer.parseInt(num);
			}else if(dir.equals("W")){
				x -= Integer.parseInt(num);
			}
		}
		return (x+" "+y);
	}

	public static void main(String[] args){
//		int n = 4;
//		String[] a = {"N3", "E2", "S1", "E2"};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		sc.nextLine();
		for(int i=0;i<n;i++){
			arr.add(sc.nextLine());
		}

		System.out.println(solution(n, arr));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
