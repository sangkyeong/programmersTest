package programmersTest;

import java.util.LinkedList;

public class test231106_1111_LV1_makeHamburger {
    public static int solution(int[] ingredient) {
	    int answer = 0;
	    LinkedList<Integer> lik = new LinkedList<>();
	    for(int i=0;i<ingredient.length;i++) {
	    	lik.add(ingredient[i]);
	    	System.out.println(lik);
	    	if(lik.size() >= 4 && (lik.get(lik.size()-4)+""+lik.get(lik.size()-3)+""+lik.get(lik.size()-2)+""+lik.get(lik.size()-1)).equals("1231")) {
	    		lik.remove(lik.size()-4);
	    		lik.remove(lik.size()-3);
	    		lik.remove(lik.size()-2);
	    		lik.remove(lik.size()-1);
	    		System.out.println("삭제후"+lik);
	    		answer++;
	    	}
	    }
	    	
//      while(str.indexOf("1231") != -1) {
//    	str = str.replace("1231", "");
//    	answer++;
//      }

        return answer;
    }

	public static void main(String[] args){
		int[] ingredient = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
		//int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		
		System.out.println(solution(ingredient));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}