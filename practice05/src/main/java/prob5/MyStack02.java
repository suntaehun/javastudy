package prob5;

public class MyStack02 {
	private Object[] buffer;
	private int top;

	public MyStack02(int size) {
		buffer = new String[size*2];
	}

	public void push(Object o) {
		buffer[top] = o;
		top++;
	}

	public Object pop() throws MyStackException {
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