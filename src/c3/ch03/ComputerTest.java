package c3.ch03;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c = new Desktop();
		c.display();
		c.turnOff();
		
		NoteBook n = new MyNoteBook();
	}

}
