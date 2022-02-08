package c3.ch09;

public interface Queue {

	void enQueue(String title);
	String deQueue();
	
	int getSize();
}
