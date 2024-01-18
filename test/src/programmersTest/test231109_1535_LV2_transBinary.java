package programmersTest;

import java.util.LinkedList;

public class test231109_1535_LV2_transBinary {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int step = 0;
        int num = 0;
        LinkedList<Character> link = new LinkedList<>();
        
        while(!s.equals("1")) {
        	
	        char[] chr = s.toCharArray();
	        
	        for(char str : chr) {
	        	if(str == '1') {
	        		link.add(str);
	        	}
	        }
	        num += chr.length - link.size();
	        s = Integer.toBinaryString(link.size());
    		step++;
    		answer[0] =  step;
    		answer[1] =  num;
	        link.clear();
        }
        
//        while(s.contains("0")) {
//        	char[] chr = s.toCharArray();
//        	for(int i=0;i<chr.length;i++) {
//        		link.add(chr[i]);
//        		if(chr[i] == '0') {
//        			System.out.println(link);
//        			link.remove(link.size()-1);
//        			num++;
//        		}
//        		s = link.toString();
//        	}
//        	
//        	if(!Integer.toBinaryString(s.length()).equals(1)) {
//        		s = Integer.toBinaryString(s.length());
//        		step++;
//        		System.out.println(step+" "+num);
//        	}
//        }
        return answer;
    }

	public static void main(String[] args){
		String new_id = "1111111";
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
