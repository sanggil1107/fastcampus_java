package c3.ch07;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		buyer.buyorder();
		buyer.order();
		
		seller.sellorder();
		seller.order();
	}
}
