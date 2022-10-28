package exception;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			MyClass myClass = new MyClass();
			myClass.danger();
		} catch (MyException e) {
			System.out.println("erroe : " + e);
		}
	}
}
