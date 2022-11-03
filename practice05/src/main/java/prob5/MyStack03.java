package prob5;

public class MyStack03<T> {
	private T[] buffer;
	private int top;

	@SuppressWarnings("unchecked")
	public MyStack03(int size) {
		buffer = (T[])new Object[size*2];
	}

	public void push(T o) {
		buffer[top] = o;
		top++;
	}

	public T pop() throws MyStackException {
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