package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		int sum = 0;

		for (int i = number; i >= 0; i = i - 2) {
			sum += i;
		}
		System.out.println(sum);

	}
}
