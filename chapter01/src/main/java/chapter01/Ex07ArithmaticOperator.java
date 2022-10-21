package chapter01;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
//		binary operator
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
//		unary operator
		System.out.println(-a);
		
		++a;
//		a += 1;
//		a = a + 1;
		System.out.println(a);
		
		a++;
//		a += 1;
//		a = a + 1;
		System.out.println(a);
		
		System.out.println(a++);
//		System.out.println(a);
//		a = a + 1;
		System.out.println(a);
		
		System.out.println(++a);// 7
		System.out.println(a);	// 7
		
		System.out.println(--a);// 6
		System.out.println(a);	// 6
		System.out.println(a++);// 6
		System.out.println(a);	// 7
	}

}
