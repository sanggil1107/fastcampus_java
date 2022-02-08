package c3.ch07;

public interface Buy {

	void buy();
	
	default void buyorder() {
		System.out.println("buyorder");
	}
	
	default void order() {
		System.out.println("구매 주문");
	}

}
