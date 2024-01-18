package programmersTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class test231016_1409 {
	static int p = 0;
	static int q = 0;
	static int cnt = 0;
	
	public static int solution(int a, int b, int c, int d) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> sameList = new ArrayList<Integer>(); 
		sameList.add(a);
		sameList.add(b);
		sameList.add(c);
		sameList.add(d);
		ArrayList<Integer> diffList = new ArrayList<Integer>(); 


		System.out.println(sameList);
		
		
		int idx = 1;
		for(int inSame : sameList) {
			if(map.containsKey(inSame)) {
				map.put(inSame, map.get(inSame)+1);
				continue;
			}
			map.put(inSame, idx);
		}
		Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
        	diffList.add(key);
        }
		
		System.out.println(diffList);
		System.out.println(map);
		
		switch(map.size()){
			case 1:
				System.out.println(diffList.get(0)*1111);
				break;
			case 2:
				if(map.get(diffList.get(0)) == 3 || map.get(diffList.get(1)) == 3) {
					//1,3
					int p = map.get(diffList.get(0)) == 3 ? diffList.get(0) : diffList.get(1);
					int q = map.get(diffList.get(0)) == 1 ? diffList.get(0) : diffList.get(1);
					System.out.println((int)Math.pow(10*p+q, 2));
					break;
				}else {//2,2
					int p = diffList.get(0);
					int q = diffList.get(1);
					System.out.println((p+q)*(Math.abs(p-q)));
					break;
				}
			case 3:
				//2,1,1
				if(map.get(diffList.get(0)) == 2) System.out.println(diffList.get(1) * diffList.get(2)); 
				if(map.get(diffList.get(1)) == 2) System.out.println(diffList.get(0) * diffList.get(2)); 
				if(map.get(diffList.get(2)) == 2) System.out.println(diffList.get(0) * diffList.get(1)); 
				break;
			case 4:
				diffList.sort(Comparator.naturalOrder());
				System.out.println(diffList.get(0));
				break;
		}

//		map.forEach((key, value) -> {
//			if(value == 4) {
//				System.out.println(1111*key);
//			}else if(value == 3) {
//				p = key;
//				if(q != 0)
//					System.out.println((int)Math.pow(10*p+q, 2));
//			}else if(value == 2) {
//				if(p != 0)
//					q = key;
//				if(p == 0)
//					p = key;
//				if(p != 0 && q != 0 && map.size() == 2) 
//					System.out.println((p+q)*(Math.abs(p-q)));
//				if(p != 0 && q != 0 && map.size() == 3) 
//					System.out.println(diffList.get(0)*diffList.get(1));
//			}else if(value == 1) {
//				cnt++;
//				diffList.add(key);
//				q = key;
//				System.out.println("diffList"+diffList);
//				if(p != 0 && (diffList.size() == 1) && map.size() == 2)
//					System.out.println((int)Math.pow(10*p+q, 2));
//				if(p != 0 && (diffList.size() >= 2) && map.size() == 3)
//					System.out.println(diffList.get(0)*diffList.get(1));
//				if(cnt == 4) {
//					diffList.sort(Comparator.naturalOrder());
//					System.out.println(diffList.get(0));
//				}
//				
//			}
//		});

		return answer;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 2;
		int d = 6;
		solution(a,b,c,d);
	}

}
