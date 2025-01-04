package programmersTest;

import java.util.*;

class Pizza {
	public String name;
	public int price_S;
	public int price_M;
	public int price_L;

	public Pizza(String name, int price_S, int price_M, int price_L) {
		this.name = name;
		this.price_S = price_S;
		this.price_M = price_M;
		this.price_L = price_L;
	}
}

class OrderItem {
	public String name;
	public String size;
	public int quantity;

	public OrderItem(String name, String size, int quantity) {
		this.name = name;
		this.size = size;
		this.quantity = quantity;
	}
}
public class codingTest250102_0001_ {
	static HashMap<String, int[]> menu2 = new HashMap<>();	//사이즈별 단가 정보
	static PriorityQueue<Integer> result = new PriorityQueue<>(); //할인 적용 별 가격
	public static String solution(Pizza[] menu, OrderItem[] order) {
		String answer = "";
		int sumCount = 0;

		for(int i=0;i<menu.length;i++) {
			menu2.put(menu[i].name, new int[]{menu[i].price_S, menu[i].price_M, menu[i].price_L}); //사이즈별 단가 저장
		}

		for(int j=0;j<order.length;j++) {
			sumCount += order[j].quantity;	//구매 총 개수
		}

		if(sumCount >= 3) result.add(discount1(order, sumCount));
		result.add(20);
//		result.add(discount2(order));
//		result.add(discount3(order));
//		result.add(discount4(order));
//		result.add(discount5(order));
		return String.valueOf(result.poll().intValue());
	}

	//할인1 : 3개중 가장 저렴한 건 무료
	public static int discount1(OrderItem[] order, int sumCount){
		PriorityQueue<Integer> priceList = new PriorityQueue<>();	//주문 피자 단가 저장
		int price = 0;
		int i = 0;
		while(sumCount > 0){
			int[] menuNm = menu2.get(order[i].name);
			if(order[i].size.equals("Small")){
				priceList.add(menuNm[0]);
			}else if(order[i].size.equals("Medium")){
				priceList.add(menuNm[1]);
			}else{
				priceList.add(menuNm[2]);
			}
			sumCount--;
			if(order[i].quantity < sumCount) i++;
		}
		priceList.remove();
		int size = priceList.size();
		for (int j = 0; j < size; j++) {
			price += priceList.poll();
		}

		return price;
	}

	public static void main(String[] args){
		Pizza[] menu = new Pizza[]{
				new Pizza("greek", 7, 5, 10),
				new Pizza("texas", 8, 9, 13),
				new Pizza("european", 5, 10, 13)
		};

		OrderItem[] order = new OrderItem[]{
				new OrderItem("texas", "Medium", 1),
				new OrderItem("european", "Small", 2)
		};

		System.out.println(solution(menu, order));
		//S0ystem.out.println(Arrays.toString(solution(N)));
	}
}
