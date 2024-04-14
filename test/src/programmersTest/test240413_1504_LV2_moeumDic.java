package programmersTest;
import java.util.HashMap;
public class test240413_1504_LV2_moeumDic {
    public static int solution(String word) {
		int answer = 0;
		HashMap<String, Integer> dic = new HashMap<>();
		dic.put("A", 0);
		dic.put("E", 1);
		dic.put("I", 2);
		dic.put("O", 3);
		dic.put("U", 4);

		//문자열을 배열로 변환
		String[] words = word.split("");

		//경우의 수를 누적 계산해줌
		int sum = 0;
        for(int i=0;i<words.length;i++){
			if(!words[i].equals("A")){
				sum += (sum(i, dic.get(words[i])));
			}
		}
		answer += words.length+sum;

		return answer;
	}

	//각 자리수가 변할때의 차이 값*모음사전에서 몇번쨰인지
	public static int sum(int i, int getWord){
		int[] option = {781, 156, 31, 6, 1};
		return option[i]*getWord;
	}

	public static void main(String[] args){
		String new_id = "I";
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
