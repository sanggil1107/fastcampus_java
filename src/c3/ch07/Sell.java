package c3.ch07;

public interface Sell {

	void sell();
	
	default void sellorder() {
		System.out.println("sellorder");
	}
	
	default void order() {
		System.out.println("판매 주문");
	}

}
