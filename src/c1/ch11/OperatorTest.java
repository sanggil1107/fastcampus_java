package c1.ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		int lastScore = ++gameScore;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		int gameScore1 = 150;
		int lastScore1 = gameScore1++;
		
		System.out.println(lastScore1);
		System.out.println(gameScore1);
		
	}

}
