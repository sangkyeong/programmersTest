package programmersTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class test231020_1036_LV1_singoCallreceive {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //report분리해서 담기
        String[] rptDtl = {};
        //신고한사람, 메일받는횟수 담기
        LinkedHashMap<Integer, Integer> singoIn = new LinkedHashMap<>();
        
        //id 인덱스화
        HashMap<String, Integer> singoList = new HashMap<>();
        //각id인덱스, 신고당한횟수
        HashMap<Integer, Integer> singoCallList = new HashMap<>();
        //2차원배열로 신고현황 정리
        int [][] inTest = new int[id_list.length][id_list.length];
        //횟수충족되는 사용자 담기
        HashSet<Integer> list = new HashSet<>();
        
        //id 인덱스화
        for(int a = 0; a<id_list.length;a++) {
        	singoIn.put(a, 0);
        	singoList.put(id_list[a], a);
        }
        
        //2차원배열로 신고현황 정리, 신고당한사람은 1, 아닌 사람은 0으로 
        for(int i=0;i<report.length;i++) {
        	rptDtl = report[i].split(" ");
        	if(inTest[singoList.get(rptDtl[0])][singoList.get(rptDtl[1])] == 1) continue;
        	inTest[singoList.get(rptDtl[0])][singoList.get(rptDtl[1])] = 1; 
        }
        
        //배열로 신고현황 정리
        for(int i=0;i< inTest.length;i++) {
        	for(int cnt=0;cnt<inTest[i].length;cnt++) {
	        	if(inTest[cnt][i] == 1) {
	    			if(singoCallList.get(i) == null) {
	    				singoCallList.put(i, 1);
	    			}else{
	    				singoCallList.put(i, singoCallList.get(i)+1);
	    			}
	    			
	    			if(singoCallList.get(i) >= k) {
	    				list.add(i);
	    				continue;
	    			}
	    		}
        	}
        }

        for(int num : list) {
	        for(int i=0;i<inTest.length;i++) {
	        	if(inTest[i][num] == 1) {
	        		singoIn.put(i, singoIn.get(i)+1);
	        	}
	        }
        }
        
        System.out.println(Arrays.deepToString(inTest));
        System.out.println(singoCallList);
        
        for(int i=0;i<id_list.length;i++) {
        	answer[i] = singoIn.get(i);
        }
        return answer;
    }

	public static void main(String[] args) {
		String[] id_list = {"a", "ab", "abc", "b"};
		String[] report = {"ab a", "abc a", "b a", "a ab", "abc ab", "b ab"};
		int k = 2;
		
		System.out.println(Arrays.toString(solution(id_list, report, k)));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
