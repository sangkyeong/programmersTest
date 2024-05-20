package programmersTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test240520_2134_LV2_phoneBookNum {
    public static boolean solution(String[] phone_book) {
		boolean answer = true;
		List<String> list = Arrays.asList(phone_book);

		//배열을 정렬시켜준다
		Arrays.sort(phone_book);
		for(int i=0;i<list.size();i++) {
			if(i<list.size()-1 && !list.get(i).equals(phone_book[i+1])) {
				//배열과 list내 탐색을 한다. 이 때 같은 요소는 제외한다.
				if(list.get(i+1).startsWith(phone_book[i])) {
					answer = false;
					break;
				}
			}
		};

		return answer;
    }

	public static void main(String[] args){
		String[] new_id = {"123","456","789"};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
