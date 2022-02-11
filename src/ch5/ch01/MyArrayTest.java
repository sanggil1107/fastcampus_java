package ch5.ch01;

public class MyArrayTest {

	public static void main(String[] args) {
		
		MyArray arr = new MyArray();
		arr.addElement(10);
		arr.addElement(20);
		arr.addElement(30);
		arr.insertElement(1, 50);
		arr.printAll();
		
		System.out.println("===============");
		arr.removeElement(1);
		arr.printAll();
		System.out.println("===============");
		
		arr.addElement(70);
		arr.printAll();
		System.out.println("===============");
		arr.removeAll();
		arr.printAll();
		
		System.out.println("===============");
		System.out.println(arr.getElement(2));
	}

}
