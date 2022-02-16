package ch5.ch05;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powder = new GenericPrinter<Powder>();
		powder.setMaterial(new Powder());
		System.out.println(powder);

		GenericPrinter<Plastic> plastic = new GenericPrinter<Plastic>();
		plastic.setMaterial(new Plastic());
		System.out.println(plastic);

	}

}
