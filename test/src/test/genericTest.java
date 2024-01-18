package test;

abstract class vehicle{
	public vehicle() {
		
	}
	
	void board() {
		System.out.println("탑승하다");
	}
	
	void move() {
		System.out.println("move");
	};
	
	void pay() {
		System.out.println("pay");
	};
	
}

class Texi extends vehicle {

	public Texi() {
		
	}
	
	@Override
	void move() {
		System.out.println("목적지도착");
	}
	
	@Override
	void pay() {
		System.out.println("요금계산");
	}
}

class Bus extends vehicle {

	public Bus() {
		
	}
	
	@Override
	void move() {
		System.out.println("정류장도착");
	}
	
	@Override
	void pay() {
		System.out.println("승차요금계산");
	}
}


public class genericTest{
	public static void main(String[] args) {
		vehicle t = new Texi();
		vehicle b = new Bus();
		
		t.board();
		t.move();
		t.pay();
		
		b.board();
		b.move();
		b.pay();
	}
}
