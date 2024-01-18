package programmersTest;

import java.util.ArrayList;

public class test231121_1722_LV2_PibonachiNum {
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        if(n > 1) {
		    for(int i=0;i < n;i++) {
		    	//100,000번째는 int형의 범위(-2,147,483,648 ~ 2,147,483,647)가 넘어가서 
		    	//1234567로 나눈 나머지를 항상 대입시켜놓으면 그 값이 항상 유지된다.(A + B) % C = ((A % C) + (B % C)) % C
		    	list.add(((list.get(i) % 1234567) + (list.get(i+1) % 1234567)) % 1234567);
		   		answer = list.get(list.size()-2) % 1234567;
		    }
        }else if(n == 1) answer = 1;
        else answer = 0;
        
        return answer;
    }

	public static void main(String[] args){
		int new_id = 100000;
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
