package programmersTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class test240119_0924_LV2_phoneBookList {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		List<String> list = Arrays.asList(phone_book);

		for(int i=0;i<list.size();i++) {
			hash.put(i, list.get(i));

			list.stream()
			.filter(it ->

			it.startsWith(IntStream.range(0, list.size()).forEach(idx -> {
				hash.get(idx);
			})))

			.findFirst().toString();
			/*
			 * if(hash.get(i).startsWith()) { System.out.println(hash.get(i)); answer=false;
			 * };
			 */
		};

		return answer != false ? false : true;
	}

	public static void main(String[] args){
		String[] phone_book = {"12","123","1235","567","88"};

		System.out.println(solution(phone_book));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}