package ch5.ch03;

import ch5.ch01.MyArray;

public class MyArrayStack {

	int top;
	MyArray mystack;
	
	public MyArrayStack() {
		top = 0;
		mystack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		mystack = new MyArray(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		
		mystack.addElement(data);
		top++;
	}
	
	public int pop() {
		if(top == 0) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return mystack.removeElement(--top);
	}
	
	public int peek() {
		if(top == 0) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return mystack.getElement(top-1);
	}
	
	public int getSize() {
		return top;
	}
	
	public boolean isFull() {
		if(top == mystack.ARRAY_SIZE){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printAll() {
		mystack.printAll();
	}
}
