package programmersTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class test231019_1408_LV1_NaMeZigali {
	
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> listPlus = new ArrayList<Integer>(); //n+1약수모음
        ArrayList<Integer> listMinus = new ArrayList<Integer>(); //n-1약수모음
        
        for (int i = 1; i * i <= n+1; i++) {
        	if ((n+1) % i == 0) {
        		listPlus.add(i);
                if (i != (n+1) / i) {
                	listPlus.add((n+1) / i);
                }
            }
        }
        
        for (int i = 1; i * i <= n-1; i++) {
        	if ((n-1) % i == 0) {
        		listMinus.add(i);
                if (i != (n-1) / i) {
                	listMinus.add((n-1) / i);
                }
            }
        }
       
        System.out.println(listPlus);
        System.out.println(listMinus);
        Set<Integer> set = new LinkedHashSet<Integer>(listPlus);
        set.addAll(listMinus);
        ArrayList<Integer> mergedList = new ArrayList<>(set);
        Collections.sort(mergedList);
        if(mergedList.get(0) == 1) mergedList.remove(0);
        System.out.println(mergedList);
        return answer = mergedList.size() != 0 ? mergedList.get(0) : n-1;
        
//        걍 이걸로 제출
//        int answer = 0;
//        for(int i = 2;i <=n;i++){
//            if(n%i == 1){
//                answer = i;
//                break;
//            }
//        }
//        return answer;
    }

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(solution(n));
		//System.out.println(Arrays.toString(solution(N)));
	}
}
