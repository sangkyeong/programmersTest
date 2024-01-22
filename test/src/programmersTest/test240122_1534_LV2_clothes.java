package programmersTest;

import java.util.HashMap;

public class test240122_1534_LV2_clothes {
	public static int solution(String[][] clothes) {
		int answer = 0;
		int temp = 1;
		HashMap<String, Integer> map = new HashMap<>();

		for(int i=0;i<clothes.length;i++) {
			if(map.get(clothes[i][1]) == null) {
				map.put(clothes[i][1], 1);
			}else {
				map.put(clothes[i][1], map.get(clothes[i][1])+1);
			}
		}

		for(int val : map.values()) {
			temp *= val;
		}
		answer = clothes.length+(map.size() != 1 ? temp: 0);

		if((temp == 1) && (map.size() != 1)) {
			temp = 1;
			for(int j=map.size();j > 1;j--) {
				temp *= j;
			}
			answer = temp + 1;
		}
		return answer;
	}

	public static void main(String[] args){
		String[][] new_id = {{"a", "headgear"},
				{"b", "headgear"},
				{"c", "eyewear"},
				{"d", "eyewear"},
				{"e", "face"},
				{"f", "face"}};

		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
