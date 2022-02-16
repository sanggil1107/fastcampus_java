package c3.ch02;


abstract class a {
	public void move() {
		System.out.println("a move");
		tt();
	}
	
	public abstract void tt();
	
}

class b extends a {
	public void tt() {
		System.out.println("bb");
	}
	
	public void bme() {
		System.out.println("method");
	}
	
}

public class ttttt {

	public static void main(String[] args) {
		
		a aa = new b();
		aa.move();
	}
}
