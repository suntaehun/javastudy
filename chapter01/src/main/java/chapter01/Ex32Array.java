package chapter01;

public class Ex32Array {

	public static void main(String[] args) {
//		선언 시 크기를 지정할 수 없다.
//		int[10] a1;
		
		
		int[] a2 = new int[5];	// 개추
		System.out.println(a2.length);
		
		
		int a3[] = new int[5];	// 비추
		System.out.println(a3.length);
		
		// 초기화 1
		int[] a4 = {0, 1, 2, 3, 4};
		System.out.println(a4.length);
		
		// 초기화 2
		int[] a5 = new int[5];
		a5[0] = 0;
		a5[1] = 1;
		a5[2] = 2;
		a5[3] = 3;
		a5[4] = 4;
		System.out.println(a5.length);
		
		// 초기화 3
		int[] a6 = new int[] {0, 1, 2, 3, 4};
		System.out.println(a6.length);

		// 사용 : 1.랜덤 접근
		System.out.println(a6[4]);
		
		// 사용 : 2. 순회
		for(int i = 0; i < a6.length; i++) {
			System.out.print(a6[i] + "  ");
		}
	}

}
