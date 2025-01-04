package programmersTest;

public class codingTest250102_0000_ {
    public static int solution(int[] start, int[] dest, int[] limit) {
		int pay = 0; // 지불요금 합계
		int largest = 0; //가장 큰 역번호

		for(int i = 0;i < start.length ;i++){
			pay += (Math.abs(start[i] - dest[i]) * 2) + 1;	//총 요금 누적집계
			if(largest == 0) {
				largest = Math.max(start[i], dest[i]);
			}else{
				largest = Math.max(largest, dest[i]);
				largest = Math.max(largest, start[i]);
			}
		}

        return Math.min(pay, limit[largest]);
	}

	public static void main(String[] args){
		int[] new_id1 = {1,2,0,2,3};	//출발역
		int[] new_id2 = {2,1,2,1,2};	//도착역
		int[] new_id3 = {4,8,18,16,20};	//역 번호에 따른 최대 제한 요금

		System.out.println(solution(new_id1, new_id2, new_id3));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
