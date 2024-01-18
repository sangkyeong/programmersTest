package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _test231114_1454_LV2_lightWayCycle {
	public static int[] solution(String[] grid) {
        String [][] grid2 = new String[grid.length][grid.length];
        Integer [][] gridMovPos = new Integer[grid[0].split("").length*2][4];
        ArrayList<Integer> list = new ArrayList<>(grid[0].length()*4);
        ArrayList<Integer> alist = new ArrayList<>();
        int gridEleCnt = 0;
        int flag = 0;
        int z=0;
        int k=0;
        
        for(int i=0;i<grid.length;i++) {
        	String[] strIn = grid[i].split("");
        	if(grid[i].length()>1) {
	        	for(int j=0;j<strIn.length;j++) {
	        		grid2[j][i] = strIn[j];
	        		gridEleCnt++;
	        	}
        	}else {
        		grid2[i] = strIn;
        		gridEleCnt++;
        	}
        }
        while(gridEleCnt > k) {
        	for(int cnt=0;cnt<4;cnt++) {
    			gridMovPos[k][cnt] = 0;
    		}
        	k++;
        }
        
        while(flag < 4) {
        	list.add(flag);
        	//빛시작
        	gridMovPos[0][flag] = 1;
	        System.out.println("start : "+flag+" pattern "+gridMove(grid2, list, gridMovPos));
	        flag++;
	        //alist.add(cnt);
        }
        //System.out.println(alist);
        
        int[] answer = new int[alist.size()];
        for(int num=0;num<alist.size();num++) {
        	answer[num] = alist.get(num);
        }
        
        return answer;
    }
	
	public static ArrayList gridMove(String[][] grid2, ArrayList<Integer> list2, Integer[][] gridMovPos) {
		
		//현재 빛의 위치
		ArrayList<Integer> list3 = new ArrayList<>();
	        
		int gridX=0;
    	int gridY=0;
    	int posX=0;
    	int posY=0;
    	
        while(true) {
        	System.out.println(Arrays.deepToString(gridMovPos));
//        	if(gridX < 0 ) {
//        		gridX = grid2.length-1;
//        	}else if(gridY < 0) {
//        		gridY = grid2[0].length-1;
//        	}else if(gridX > grid2.length-1) {
//        		gridX = 0;
//        	}else if(gridY > grid2[0].length-1) {
//        		gridY = 0;
//        	}
        	if(gridX < 0 ) {
        		gridX = grid2.length-1;
        	}else if(gridY < 0) {
        		gridY = grid2[0].length-1;
        	}else if(gridX > grid2.length-1) {
        		gridX = 0;
        	}else if(gridY > grid2[0].length-1) {
        		gridY = 0;
        	}
        		
	       switch(grid2[gridX][gridY]) {
			case "S":
				for(int i=0;i<gridMovPos.length;i++) {
					if(gridMovPos[i][0] == 1) {
						gridY++;
		        		list3.add(i);
						list3.add(3);
						gridMovPos[i][3] = 1;
						break;
					}
					if(gridMovPos[i][1] == 1) {
						gridX++;
						list3.add(i);
						list3.add(1);
						
						gridMovPos[i][1] = 0;
						gridMovPos[i][2] = 1;
						break;
					}
					if(gridMovPos[i][2] == 1) {
						gridX--;
						list3.add(i);
						list3.add(2);
						gridMovPos[i][2] = 0;
						gridMovPos[i][1] = 1;
						break;
					}
					if(gridMovPos[i][3] == 1) {
						gridY--;
						list3.add(i);
						list3.add(3);
						gridMovPos[i][3] = 0;
						gridMovPos[i][0] = 1;
						break;
					}
				}
			case "L":
				for(int i=0;i<gridMovPos.length;i++) {
					if(gridMovPos[i][0] == 1) {
						gridX++;
						list3.add(i);
						list3.add(0);
						gridMovPos[i][0] = 0;
						gridMovPos[i][2] = 1;
						break;
					}
					if(gridMovPos[i][1] == 1) {
						gridY--;
						list3.add(i);
						list3.add(1);
						gridMovPos[i][1] = 0;
						gridMovPos[i][0] = 1;
						break;
					}
					if(gridMovPos[i][2] == 1) {
						gridY++;
						list3.add(i);
						list3.add(2);
						gridMovPos[i][2] = 0;
						gridMovPos[i][3] = 1;
						break;
					}
					if(gridMovPos[i][3] == 1) {
						gridX--;
						list3.add(i);
						list3.add(3);
						gridMovPos[i][3] = 0;
						gridMovPos[i][1] = 1;
						break;
					}
				}
			case "R":
				for(int i=0;i<gridMovPos.length;i++) {
					if(gridMovPos[i][0] == 1) {
						gridX--;
						list3.add(i);
						list3.add(0);
						gridMovPos[i][0] = 0;
						gridMovPos[i][1] = 1;
						list3.add(i);
						list3.add(1);
						if(i-2 < 0) {
							gridMovPos[i][1] = 0;
							gridMovPos[0][2] = 1;
							list3.add(0);
							list3.add(2);
						}else {
							gridMovPos[i][1] = 0;
							gridMovPos[i-2][2] = 1;
							list3.add(i-2);
							list3.add(2);
						}
						break;
					}
					if(gridMovPos[i][1] == 1) {
						gridY++;
						list3.add(i);
						list3.add(1);
						gridMovPos[i][1] = 0;
						gridMovPos[i][3] = 1;
						list3.add(i);
						list3.add(3);
						if(i+1 > gridMovPos.length-1) {
							gridMovPos[i][3] = 0;
							gridMovPos[i][0] = 1;
							list3.add(i);
							list3.add(0);
						}else {
							gridMovPos[i][3] = 0;
							gridMovPos[i+1][0] = 1;
							list3.add(i+1);
							list3.add(0);
						}
						break;
					}
					if(gridMovPos[i][2] == 1) {
						gridY--;
						list3.add(i);
						list3.add(2);
						gridMovPos[i][2] = 0;
						gridMovPos[i][0] = 1;
						list3.add(i);
						list3.add(0);
						if(i-1 < 0) {
							gridMovPos[i][0] = 0;
							gridMovPos[gridMovPos.length-1][3] = 1;
							list3.add(gridMovPos.length-1);
							list3.add(3);
						}else {
							gridMovPos[i][0] = 0;
							gridMovPos[i-1][3] = 1;
							list3.add(i-1);
							list3.add(3);
						}
						break;
					}
					if(gridMovPos[i][3] == 1) {
						gridX++;
						list3.add(i);
						list3.add(3);
						gridMovPos[i][3] = 0;
						gridMovPos[i][2] = 1;
						list3.add(i);
						list3.add(2);
						if(i+2 > gridMovPos.length-1) {
							gridMovPos[i][2] = 0;
							gridMovPos[i][1] = 1;
							list3.add(i);
							list3.add(1);
						}else {
							gridMovPos[i][2] = 0;
							gridMovPos[i+2][1] = 1;
							list3.add(i+2);
							list3.add(1);
						}
						break;
					}
				}
        }
	       //System.out.println(list3);
	       if(list3.size() > 16 && list3.get(list3.size()-2).equals(list3.get(0)) && list3.get(list3.size()-1).equals(list3.get(1))) {
	    	   list3.remove(list3.size()-1);
	    	   list3.remove(list3.size()-1);
	    	   break;
	       }
		}
		return list3;
	}
	public static void main(String[] args){
		String[] new_id = {"R","R"};
		
		System.out.println(solution(new_id));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
