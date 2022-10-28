package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		
		try {
			System.out.println("some code2");
			int result = (1 + 2 + 3) / b;
			
			System.out.println("some code3");
			System.out.println("some code4");
			
		} catch(ArithmeticException ex) {
//			예외 처리
			
//			1. 사과
			System.out.println("미안합니다.");
			
//			2. 로깅
			System.out.println("error : " + ex);
			
//			3. 정상 종료
//			System.exit(0);
			return;
		} finally {
//			예외가 발생하거나 정상적으로 실행 되어도 반드시 실행되는 블록
			System.out.println("자원 정리");
		}
//		예외가 발생한 이후에 실행되는 코드이기 때문에 비추ㅜ
//		System.out.println("some code4");
	}

}
