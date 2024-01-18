package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test230905{
	public static void main(String[] args) {
		String ky = "0";
		int size = 0;
		ArrayList<String> xArray = new ArrayList<String>();
		
		while(true) {
			System.out.print("key[0:NEW / 1:RETRY / 2:END] : ");
			Scanner sc = new Scanner(System.in);
			ky = sc.next();
			switch(ky) {
				case "0":
					System.out.print("배열의 크기를 입력하세요. : ");
					size = sc.nextInt();
					scan(size, ky, xArray);
					break;
				case "1":
					scan(size, ky, xArray);
					break;
				default:
					System.out.print("----END----");
					return;
			}
		}
	}
	
	static void scan(int size, String ky, ArrayList<String> xArray) {
		
		Scanner scArray = new Scanner(System.in);
		
		if(ky.equals("0")) {
			xArray = new ArrayList<String>();
			for(int i=0;i<size;i++) {
				System.out.print("x["+i+"] : ");
				String xScArray = scArray.next();
				xArray.add(i, xScArray);
			}
		}
		
		System.out.print("검색할 값을 입력하세요. : ");
		String srhSc = scArray.next();
		for(int j=0;j<xArray.size();j++) {
			if(j == 0)
				System.out.print("  | "+j+"  ");
			else {
				System.out.print(j+"  ");
			}
		}
		System.out.println("");
		System.out.println("--------------------");
		for(int k=0;k<xArray.size();k++) {
			System.out.print("  | ");
				if(k == xArray.indexOf(xArray.get(k))) {
					for(int y=0; y<k;y++)
						System.out.print("   ");
					System.out.println("*");
				}else
					System.out.println("");
				System.out.println((k+" | "+xArray).replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\,"," "));
			if(xArray.get(k).equals(srhSc)) {
				System.out.println((k+1)+"번째 에서 ["+xArray.get(k)+"] 값을  찾았습니다.");
				break;
			}else if(k == xArray.size()-1){
				System.out.println("값이 없습니다.");
				break;
			}
		}
		
		System.out.println("배열값은 : "+xArray);
	}
}
