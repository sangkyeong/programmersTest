package programmersTest;

import java.util.Arrays;
import java.util.List;

public class test240119_0924_LV2_phoneBookList {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		List<String> list = Arrays.asList(phone_book);

		Arrays.sort(phone_book);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+"  "+phone_book[i]);
			if(i<list.size()-1 && !list.get(i).equals(phone_book[i+1])) {
				if(list.get(i+1).startsWith(phone_book[i])) {
					answer = false;
					break;
				}
			}

			/*
			 * list.stream() .filter(it ->
			 *
			 * it.startsWith(IntStream.range(0, list.size()).forEach(idx -> { hash.get(idx);
			 * })))
			 *
			 * .findFirst().toString();
			 */
			/*
			 * if(hash.get(i).startsWith()) { System.out.println(hash.get(i)); answer=false;
			 * };
			 */
		};

		return answer;
	}

	public static void main(String[] args){
		String[] phone_book = {"12","123","1235","567","88"};

		System.out.println(solution(phone_book));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}