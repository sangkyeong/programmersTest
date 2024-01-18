package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;

public class test231101_1336_LV1_baTangHwaMeonJeongRi {
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int[][] paper = new int[wallpaper.length][wallpaper[0].split("").length];	//2차원배열로 변환하기위한 배열 생성
        String[] str = {};	//wallpaper배열을 split하기위한 Spring배열 생성
        boolean label = true;	//초기값인지 아닌지 판별하기위한 변수
        ArrayList<Integer> rowList = new ArrayList<>();	//가로로 스캔시 저장할좌표
        ArrayList<Integer> columnList = new ArrayList<>(); //세로로 스캔시 저장할 좌표
        int Fx = 0;	//첫# x좌표
        int Fy = 0;//첫# y좌표
        int Lx = 0;//마지막# x좌표
        int Ly = 0;//마지막# y좌표
        
        //split해주면서 2차원배열도 동시에 생성, 가로스캔진행
        for(int i=0;i<wallpaper.length;i++) {
        	str = wallpaper[i].split("");
        	for(int j=0;j<str.length;j++) {
        		paper[i][j] = str[j].equals("#") ? 1:0;
        		
        		if(str[j].equals("#")) {
        			if(label) {
        		        Fx = i;
        		        Fy = j;
        		        label = false;
        			}else {
        				Lx = i;
        		        Ly = j;
        			}
        			rowList.clear();
        			rowList.addAll(Arrays.asList(Fx,Fy,Lx+1,Ly+1));
        		}
        		
        		if(i==wallpaper.length-1 && j==str.length-1 && Lx == 0 && Ly == 0) {
        			rowList.clear();
    				Lx=Fx; Ly=Fy;
    				rowList.addAll(Arrays.asList(Fx,Fy,Lx+1,Ly+1));
    			}
        	}
        }
        label = true;
        int j=0;
        //2차원배열을 바탕으로 세로스캔 시작
        while(j<wallpaper[0].split("").length) {
	        for(int i=0;i<paper.length;i++) {
	        	if(paper[i][j] == 1) {
	    			if(label) {
	    		        Fx = i;
	    		        Fy = j;
	    		        label = false;
	    			}else {
	    				Lx = i;
	    		        Ly = j;
	    			}
	    			columnList.clear();
	    			columnList.addAll(Arrays.asList(Fx,Fy,Lx+1,Ly+1));
	    		}
	        	if(i==wallpaper.length-1 && j==str.length-1 && Lx == 0 && Ly == 0) {
	        		rowList.clear();
    				Lx=Fx; Ly=Fy;
    				rowList.addAll(Arrays.asList(Fx,Fy,Lx+1,Ly+1));
    			}
	        }
	        j++;
        }
        System.out.println(rowList);
        System.out.println(columnList);
        answer[0] = rowList.get(0);
        answer[1] = columnList.get(1);
        answer[2] = rowList.get(2);
        answer[3] = columnList.get(3);
        return answer;
    }

	public static void main(String[] args){
		String[] wallpaper = {"..", "#."};
		
		System.out.println(Arrays.toString(solution(wallpaper)));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}

	
//다른풀이참고....
//	  int minX = Integer.MAX_VALUE;
//      int minY = Integer.MAX_VALUE;
//      int maxX = Integer.MIN_VALUE;
//      int maxY = Integer.MIN_VALUE;
//      for(int i=0; i< wallpaper.length;i++ ){
//          for(int j=0; j<wallpaper[i].length();j++){
//              if(wallpaper[i].charAt(j)=='#'){
//                  minX = Math.min(minX,i);
//                  minY = Math.min(minY,j);
//                  maxX = Math.max(maxX,i);
//                  maxY = Math.max(maxY,j);
//              }
//          }
//      }
//      return new int[]{minX,minY,maxX+1,maxY+1};
}
