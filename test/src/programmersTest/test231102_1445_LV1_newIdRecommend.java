package programmersTest;

import java.util.Arrays;

public class test231102_1445_LV1_newIdRecommend {
    public static String solution(String new_id) {
        String[] str = new_id.split("");
        str = Arrays.stream(str)
			 .map(String::toLowerCase)
			 //.map(s -> s.equals(" ") ? "a" : s)
		     .filter(i -> i.matches("[a-z]") || i.matches("[0-9]") || i.equals("-") || i.equals("_") || i.equals("."))
		     .toArray(String[]::new);
        new_id = String.join("", str);
        while(new_id.contains("..")) {
        	new_id = new_id.replace("..", ".");
        }
        new_id = dotRemove(new_id);
        
        if(new_id.length() > 15) {
        	new_id = new_id.substring(0, 15);
        }
        new_id = dotRemove(new_id);
        new_id = new_id.length() == 0 ?  "a" : new_id;
        while(new_id.length() <= 2) {
        	new_id += new_id.substring(new_id.length()-1, new_id.length());
        }
        return new_id;
    }

    public static String dotRemove(String str) {
        while(str.indexOf(".") == 0 || str.lastIndexOf(".") == str.length()-1) {
        	if(str.indexOf(".") == 0) {
        		str = str.substring(1);
        	}else if(str.length() == 0) {
        		break;
        	}else if(str.lastIndexOf(".") == str.length()-1) {
        		str = str.replaceFirst(".$", "");
        	}
        }
    	return str;
    }
	public static void main(String[] args){
		//String new_id = "... !@BaT#*..y.abcdefghijklm.";
		String new_id = "=.=";
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
