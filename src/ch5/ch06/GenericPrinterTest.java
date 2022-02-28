package ch5.ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> gpowder = new GenericPrinter<Powder>();
		gpowder.setMaterial(new Powder());
		Powder powder = gpowder.getMaterial();
		System.out.println(gpowder);
		System.out.println(powder);

		GenericPrinter<Plastic> gplastic = new GenericPrinter<Plastic>();
		gplastic.setMaterial(new Plastic());
		Plastic plastic = gplastic.getMaterial();
		System.out.println(gplastic);
		System.out.println(plastic);
		
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder2 = (Powder)powderPrinter2.getMaterial();
		System.out.println(powderPrinter2);
		System.out.println(powder2);
		
		//GenericPrinter<Water> printer = new GenericPrinter<Water>();	

	}

}
