package programmersTest;

import java.util.*;

public class test240420_0155_LV2_makeBigNum {
    public static String solution(String number, int k) {
		StringBuilder answer = new StringBuilder();
		Stack<Integer> stk = new Stack<>();
		String [] num = number.split("");
		//출력 되는 자릿 수
		int out = number.length()-k;

		for(int i=0;i<num.length;i++){
			//스캔중인 숫자 바로 다음 숫자가 크면 바꿔 줌
			if(!stk.empty() && stk.peek() < Integer.parseInt(num[i])){
				//뒤에 스캔할 숫자가 반환할 자릿수보다 많다면 pop
				while(!stk.empty() && stk.peek() < Integer.parseInt(num[i]) && ((stk.size() + number.length() - (i+1)) >= out)) {
					stk.pop();
				}
			}
			stk.push(Integer.parseInt(num[i]));
		}

		//사이즈가 크면 앞이나 뒤에서 자리수를 지워준다
		while(stk.size() > out){
			if(stk.get(0) < stk.get(1)){
				stk.removeFirst();
			}else{
				stk.removeLast();
			}
		}

		for(int j=0;j<stk.size();j++){
			answer.append(stk.get(j));
		}
		System.out.println(stk);

		return answer.toString();
	}

	public static void main(String[] args){
		String new_id = "9876543214";
		int a = 4;
		
		System.out.println(solution(new_id, a));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
