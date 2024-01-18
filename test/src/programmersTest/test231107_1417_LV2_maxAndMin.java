package programmersTest;

import java.util.Collections;
import java.util.LinkedList;

public class test231107_1417_LV2_maxAndMin {
    public static String solution(String s) {
        LinkedList<Integer> link = new LinkedList<>();
        String[] list = s.split(" ");
        for(int i=0;i<list.length;i++) {
        	link.add(Integer.parseInt(list[i]));
        }
        Collections.sort(link);
        return link.get(0)+" "+link.get(link.size()-1);
    }

	public static void main(String[] args){
		String new_id = "1 2 3 4";
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
