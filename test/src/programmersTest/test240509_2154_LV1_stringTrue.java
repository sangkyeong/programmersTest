package programmersTest;

public class test240509_2154_LV1_stringTrue {
    public static boolean solution(String s) {
    	boolean answer = true;
		if((s.length() == 4) || (s.length() == 6)){
			for(char sToChar : s.toCharArray()){
				if(sToChar >= 65){
					answer = false;
					break;
				}
			}
		}else{
			answer = false;
		}
		return answer;
    }

	public static void main(String[] args){
		String new_id = "123";
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
