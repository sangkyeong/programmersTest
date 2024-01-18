package programmersTest;

import java.util.LinkedList;

public class test231113_0951_LV2_numberPyohyeon {
    public static int solution(int n) {
    	int answer = 1;
    	int num2 = 0;
    	LinkedList<Integer> link = new LinkedList<>();
    	//질문참고(n의 약수중 홀수개수)
    	for(int i=1;i<=n;i++) {
    		if(n%i == 0) {
    			if(i%2==1) {
    				link.add(i);
    			}
    		}
    	}
    	answer = link.size();
//    	for(int i=1;i<n/2+1;i++) {
//    		if(i > n/2+1) break;
//    		num2 += i;
//    		link.add(i);
//    		if(num2 > n || num2 == n) {
//    			if(num2==n) {
//	    			System.out.println(link);
//	        		System.out.println(num2+" "+i);
//	        		++answer;
//    			}
//    			num2 = 0;
//    			i = link.get(0);
//    			link.clear();
//    		}
//    	}
    	
//    	for(int i=num;i>=1;i--) {
//    		link.add(i);
//    	}
//    	System.out.println(link);
//    	for(int j=0;j <= link.size();j++){
//    		num2 += link.get(j);
//    		if(num2 > n || num2 == n) {
//    			System.out.println(num2+" "+link.get(j));
//    			j=j-2;
//    			num2=0;
//    		}
//    	}
    	
    	
    	
//    	while(!link.contains(1)) {
//    		num2 += num;
//    		link.add(num);
//    		num--;
//    		
//    		if(num2 > n || num2 == n) {
//    			System.out.println(num+" "+num2);
//    			System.out.println(link);
//    			num2=0;
//    		
//    		}
//    	}
    	
        return answer;
    }

	public static void main(String[] args){
		int n = 15;
		
		System.out.println(solution(n));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
