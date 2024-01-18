package programmersTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class test231031_1721_LV1_personalDataCollectDate {
    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        String[] termsDtl = {};
        HashMap<String, Integer> termsMap = new HashMap<>();
        String[] privaciesDtl = {};
        HashMap<Date, String> privaciesMap = new HashMap<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal1 = Calendar.getInstance();
        ArrayList<Integer> list = new ArrayList<>();
        
        //약관종류 맵핑
        for(String term : terms) {
        	termsDtl = term.split(" ");
        	termsMap.put(termsDtl[0], Integer.parseInt(termsDtl[1]));
        }
        
        //개인정보 맵핑
        for(int i=0;i<privacies.length;i++) {
        	privaciesDtl = privacies[i].split(" ");
        	privaciesMap.put(formatter.parse(privaciesDtl[0]), privaciesDtl[1]);
        	
        	//각 날짜별로 약관종류에 맞춰 계산
        	cal1.setTime(formatter.parse(privaciesDtl[0]));
            cal1.add(Calendar.MONTH, termsMap.get(privaciesDtl[1]));
            cal1.add(Calendar.DATE, -1);
            
            if(cal1.get(Calendar.DATE) > 28) {
            	cal1.add(Calendar.DATE, 28);
            	cal1.add(Calendar.MONTH,-1);
            }
            System.out.println("유효기간 "+new Date(cal1.getTimeInMillis()));
            if(formatter.parse(today).after(new Date(cal1.getTimeInMillis()))) list.add(i+1);
        }
        System.out.println(termsMap);
        System.out.println(privaciesMap);
        return list.stream().mapToInt(i -> i).toArray();
    }

	public static void main(String[] args) throws ParseException {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		System.out.println(Arrays.toString(solution(today, terms, privacies)));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
