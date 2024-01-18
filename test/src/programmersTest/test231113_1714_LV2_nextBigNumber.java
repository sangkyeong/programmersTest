package programmersTest;

import java.util.ArrayList;

public class test231113_1714_LV2_nextBigNumber {
    public static int solution(int n) {
    	int answer = 0;
    	int num = 0;
    	int num2 = 0;
    	for(char str : Integer.toBinaryString(n).toCharArray()) {
    		if(str == '1') {
    			num++;
    		}
    	}
    	while(num != num2) {
    		int n2 = ++n;
	    	for(char str : Integer.toBinaryString(n2).toCharArray()) {
	    		if(str == '1') {
	    			num2++;
	    		}
	    	}
	    	if(num == num2) {
				answer = n;
			}else {
				num2 = 0;
			}
    	}
//    	int flag = 0;
//    	int flag2 = 0;
//    	ArrayList<Character> list= new ArrayList<>();
//    	for(char str : Integer.toBinaryString(n).toCharArray()) {
//    		list.add(str);
//    	}
//    	if(!list.contains('0')) {
//    		list.add(0, '1');
//    		list.set(1, '0');
//    	}else {
//    		for(int i=0;i<list.size();i++) {
//    			if(list.get(i).equals('1')) {
//    				if(flag == 1) {
//    					list.set(i-1, '1');
//    					list.set(i, '0');
//    				}else if(flag>1) {
//    					flag2++;
//    					list.set(i, '0');
//    					list.set(list.size()-flag2, '1');
//    				}
//    				flag++;
//    			}
//    		}
//    	}
        return answer;
    }

	public static void main(String[] args){
		int new_id = 15;
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
