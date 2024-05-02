package programmersTest;

import java.util.*;
import java.util.stream.Collectors;

public class test240502_2200_LV1_minSquere {
    public static int solution(int[][] sizes) {
		int max = 0, min = 0;

		for(int i =0;i< sizes.length;i++){
			max = Math.max(max, Math.max(sizes[i][0], sizes[i][1]));
			min = Math.max(min, Math.min(sizes[i][0], sizes[i][1]));
		}
		return max*min;
    }

	public static void main(String[] args){
		int[][] new_id = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
