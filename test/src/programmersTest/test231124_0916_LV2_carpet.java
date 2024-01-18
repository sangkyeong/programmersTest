package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;

public class test231124_0916_LV2_carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int by = brown + yellow;	//전체 카펫격자 개수
        int sqrt = (int) Math.sqrt(by);
        ArrayList<Integer> list = new ArrayList<>();	//카펫 격자개수의 약수를 담을 리스트
        System.out.println(sqrt);
        
        //약수를 반만 담아 시간절약
        for(int i=1;i<=sqrt;i++) {
        	if(by % i ==0) {
    			list.add(by / i);
    			System.out.println("list"+list);
        	}
        }
        
        //가로, 세로 개수와 갈, 노 격자 개수가 맞는 것으로 선택 
        int step = 1;
        while(true) {
        	if(brown == (list.get(list.size()-step) * 2) + (((by / list.get(list.size()-step))-2) * 2)) break;
        	step++;
        }
        
        answer[0] = list.get(list.size()-step);
        answer[1] = by / list.get(list.size()-step);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

	public static void main(String[] args){
		int brown = 24;
		int yellow = 24;
		
		System.out.println(solution(brown, yellow));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
