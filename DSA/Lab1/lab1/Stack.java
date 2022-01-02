package lab1;

public class Stack {
	private int top;
	private char[] stackArray;
	private int maxSize;
	
	public Stack(int s) {
		this.top = -1;
		this.stackArray = new char[s];
		this.maxSize = s;
	}
	
	//To check stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return (top == (maxSize -1));
	}
	
	public void push(char ch) {
		if(!isFull()) {
			top = top + 1;
			stackArray[top] = ch;
		}
		else {
			System.out.println();
		}
	}
}
