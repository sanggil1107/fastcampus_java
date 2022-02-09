package c4.ch01;

public class EqualTest {

	public static void main(String[] args) {
		
		Student yang = new Student(100, "Yang");
		Student yang2 = yang;
		Student choi = new Student(100, "Choi");
		
		System.out.println(yang == choi);
		System.out.println(yang.equals(choi));

		System.out.println(yang.hashCode());
		System.out.println(choi.hashCode());
	
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));

	}

}
