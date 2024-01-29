package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class test240123_1632_LV3_bestAlbum {
	public static int[] solution(String[] genres, int[] plays) {
		// map<string, map<string, object>>
		// [classic:[list:0_500/2_150, sum:1450], pop:[list, sum]]

		// genre.length for...
		// map.put();

		// map.keyset sort...
		// keyset = [pop, classic...]
		// keyset.sort  o1 o2, -> compare(o1.get("sum"))

		// keyset for string s : keyset
		// map.get(s).get("list")
		// split
		// array.sort(new comp)


		/**
		 * Arrays.sort(playStringArray, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] nums1 = o1.split("_");
                    String[] nums2 = o2.split("_");
                    int num1 = Integer.parseInt(nums1[1]);
                    int num2 = Integer.parseInt(nums2[1]);
                    return Integer.compare(num2, num1);
                }
            });
		 */


		//장르별 재생수 합 map
		HashMap<String, Integer> genreToSum = new HashMap<>();

		//장르별 재생횟수 map
		HashMap<String, List<Integer>> genreToPlay = new HashMap<>();

		List<Integer> playsIdx = Arrays.stream(plays).boxed().collect(Collectors.toList());

		List<Integer> ans = new ArrayList<>();

		//map들 정보 입력
		for(int i=0;i<genres.length;i++) {

			//장르별 재생수 합 map 정보입력
			if(genreToSum.get(genres[i]) == null) {
				genreToSum.put(genres[i], plays[i]);
			}else {
				genreToSum.put(genres[i], genreToSum.get(genres[i])+plays[i]);
			}

			//현재 입력중인 장르
			String nowGen = genres[i];

			//장르별 재생횟수 map 정보입력
			if(genreToPlay.get(nowGen) == null) {
				genreToPlay.put(nowGen,
					IntStream.of(plays[i]).boxed().collect(Collectors.toList())
					);
			}else {
				genreToPlay.get(nowGen).add(genreToPlay.get(nowGen).size(), plays[i]);
				Collections.sort(genreToPlay.get(nowGen), Collections.reverseOrder());
			}
		}

		//장르별 재생 수 많은순 정렬
		TreeMap<Integer, String> sort = new TreeMap<>();
		for(String i : genreToSum.keySet()) {
			sort.put(genreToSum.get(i), i);
		}

		System.out.println("genreToPlay "+genreToPlay);
		System.out.println("genreToSum "+genreToSum);
		System.out.println("sort "+sort);

		int [] answer = new int[genreToPlay.size()*2];

		for(int i=0;i<genreToPlay.size();i++) {
			if(genreToPlay.containsKey(sort.get(sort.lastKey()))) {
				int cnt = 0;
				for(int entry : genreToPlay.get(sort.get(sort.lastKey()))) {
					if(cnt < 2) {
						System.out.println(entry);
						ans.add(playsIdx.indexOf(entry));
						playsIdx.set(playsIdx.indexOf(entry), -1);
						cnt++;
					}
				}
			}
			sort.remove(sort.lastKey());
		}

		System.out.println(ans);

		return answer = ans.stream().mapToInt(i->i).toArray();
	}

	public static void main(String[] args){
		String[] new_id = {"classic", "pop", "classic", "classic", "pop"};
		int[] new_id2 = {500, 600, 150, 500, 2500};


		/**
		 * 1. 장르별 전체재생횟수
		 * 2. 가장 많은 장르 찾아서
		 * 3. 그 장르에 해당하는 횟수들 리스트 생성
		 * 4. 2개만 뽑고 나머지는 버림
		 */

		// 반복 돌면서 map classic 500+150... [classic : 1450, pop : 3100]
		// index, play
		// "500,600,800" split => {500.600.800}  map = classic, {800.600} -> save
		// sort
		// List<> : pop, classic ...

		System.out.println(solution(new_id, new_id2));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
