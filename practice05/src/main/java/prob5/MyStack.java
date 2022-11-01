package prob5;

public class MyStack {
	private String[] buffer;
	private int top;

	public MyStack(int size) {
		buffer = new String[size*2];
	}

	public void push(String string) {
		buffer[top] = string;
		top++;
	}

	public String pop() throws MyStackException {
		if(top == 0) {
			throw new MyStackException();
		}
		top--;
		return buffer[top];
		
		
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == 0;
	}

}