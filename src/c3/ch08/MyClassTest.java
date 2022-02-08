package c3.ch08;

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		X x = m;
		x.x();
		
		Y y = m;
		y.y();
		
		MyInterface i = m;
		i.x();
		i.y();
		i.myMethod();
	}
}
