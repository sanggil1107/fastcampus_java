package c3.ch04;

public class CarTest {

	public static void main(String[] args) {
		Car aicar = new AICar();
		aicar.run();
		System.out.println("=================");
		Car manualCar = new ManualCar();
		manualCar.run();

	}
}
