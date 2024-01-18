package programmersTest;

import java.util.HashMap;

public class test231102_0916_LV1_MBTITest {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Integer, Integer> point = new HashMap<>();
		point.put(1, 3);
		point.put(2, 2);
		point.put(3, 1);
		point.put(4, 0);
		point.put(5, 1);
		point.put(6, 2);
		point.put(7, 3);
		HashMap<String, Integer> sumPoint = new HashMap<>();
		sumPoint.put("R", 0);
		sumPoint.put("T", 0);
		sumPoint.put("C", 0);
		sumPoint.put("F", 0);
		sumPoint.put("J", 0);
		sumPoint.put("M", 0);
		sumPoint.put("A", 0);
		sumPoint.put("N", 0);
		for(int i=0;i<survey.length;i++) {
			String[] str = survey[i].split("");
			if(3 >= choices[i]) {
				sumPoint.put(str[0], sumPoint.get(str[0])+point.get(choices[i]));
			}else if(5 <= choices[i]){
				sumPoint.put(str[1], sumPoint.get(str[1])+point.get(choices[i]));
			}
		}
		answer = sumPoint.get("T") > sumPoint.get("R") ? answer+"T" : answer+"R";
		answer = sumPoint.get("F") > sumPoint.get("C") ? answer+"F" : answer+"C";
		answer = sumPoint.get("M") > sumPoint.get("J") ? answer+"M" : answer+"J";
		answer = sumPoint.get("N") > sumPoint.get("A") ? answer+"N" : answer+"A";
		System.out.println(sumPoint);
        return answer;
    }

	public static void main(String[] args){
		String[] survey = {"RT", "RT", "RT"};
		int[] choices = {7,2,4};
		
		System.out.println(solution(survey, choices));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
