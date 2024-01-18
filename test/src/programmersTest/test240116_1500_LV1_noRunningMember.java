package programmersTest;

import java.util.Arrays;

public class test240116_1500_LV1_noRunningMember {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        		
        for(int i=0;i<participant.length;i++) {
        	if(i>=completion.length || !participant[i].equals(completion[i])) {
        		answer = participant[i];
        		break;
        	}
        }
    
        return answer;
    }

	public static void main(String[] args){
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		
		System.out.println(solution(participant, completion ));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
