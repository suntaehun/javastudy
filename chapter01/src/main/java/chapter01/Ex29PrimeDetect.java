package chapter01;

public class Ex29PrimeDetect {

	public static void main(String[] args) {
		// 2 ~ 1000까지 소수를 화면에 출력하세요.
		System.out.println("2 ~ 1000 사이 소수");
		for (int num = 2; num <= 1000; num++) {

			boolean isPrime = true;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num);
			}

		}

	}

}
