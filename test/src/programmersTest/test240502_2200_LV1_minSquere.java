package programmersTest;

import java.util.*;
import java.util.stream.Collectors;

public class test240502_2200_LV1_minSquere {
    public static int solution(int[][] sizes) {
		TreeSet<Integer> minList= new TreeSet<>();
		TreeSet<Integer> maxList= new TreeSet<>();

		for(int i =0;i< sizes.length;i++){
			maxList.add(Math.max(sizes[i][0], sizes[i][1]));
			minList.add(Math.min(sizes[i][0], sizes[i][1]));
		}
		return maxList.getLast()*minList.getLast();
    }

	public static void main(String[] args){
		int[][] new_id = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
