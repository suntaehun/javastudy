package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
//		Unchecked Exception은 예외처리 없이 발생해야한다.
//		왜? 예외보고 수정해야하는 로직 에러이기때문이다.
//		ArrayIndexOutOfBoundsException
//		ArithmeticException
//		NullPointException
//		try {
			int[] a = {1, 2, 3, 4, 5};
			for(int i = 0; i <= 5; i++ ) {
				System.out.println(a[i]);
			}
//		} catch(Exception ex) {
//			System.out.println("error : " + ex);
//		}
	}
}
