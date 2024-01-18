package programmersTest;

import java.util.Arrays;

public class test231019_1613_LV1_keypad {
	//첫 위치는 왼손은 *, 오른손은 #
	static int Lx = 3;
	static int Ly = 0;
	static int Rx = 3;
	static int Ry = 2;
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        //*, #은 임의 숫자로 지정
        int[][] pos = {{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        String[][] pos2 = new String[4][3];

        for(int num : numbers) {
        	if(num == 1 || num == 4 || num == 7) {//왼손으로 눌러야 할 때
        		answer += "L";
        		for(int i=0;i<pos.length;i++) {
        			for(int j = 0;j<pos[i].length;j++) {
        				if(pos[i][j] == num) {
        					Lx = i;
        					Ly = j;
        				}
        			}
        		}
        	}else if(num == 3 || num == 6 || num == 9) {//오른손으로 눌러야 할 때
        		answer += "R";
        		for(int i=0;i<pos.length;i++) {
        			for(int j = 0;j<pos[i].length;j++) {
        				if(pos[i][j] == num) {
        					Rx = i;
        					Ry = j;
        				}
        			}
        		}
        	}else {//가까운 손으로 눌러야 할 때
        		for(int i=0;i<pos.length;i++) {
        			for(int j = 0;j<pos[i].length;j++) {
        				if(pos[i][j] == num) {
        					int L = Math.abs(Lx-i) + Math.abs(Ly-j); 
        					int R = Math.abs(Rx-i) + Math.abs(Ry-j);
        					if(L>R) {	//현재 위치에서 가까운 손가락으로 누를때
        						Rx = i;
            					Ry = j;
        						answer += "R";
        					}else if(L<R) {
        						Lx = i;
            					Ly = j;
        						answer += "L";
        					}else if(L == R) { //거리가 같으면 어느 손잡이 인지로 누름
        						if(hand.equals("right")) {
        							Rx = i;
                					Ry = j;
            						answer += "R";
        						}else {
        							Lx = i;
                					Ly = j;
            						answer += "L";
        						}
        					}
        				}
        			}
        		}
        	}
        }
//        pos2[Lx][Ly] = "L";
//        pos2[Rx][Ry] = "R";
//        System.out.println(Arrays.deepToString(pos2));
        return answer;
    }

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		System.out.println(solution(numbers, hand));
		//System.out.println(Arrays.toString(solution(N)));
	}
}
