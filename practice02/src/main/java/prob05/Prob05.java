package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다." + correctNumber);
			int maxNum = 100;
			int minNum = 1;
			int count = 1;

			while (true) {
				System.out.println(minNum + " ~ " + maxNum);
				System.out.print(count + ">>");
				int answer = scanner.nextInt();

				if (answer < correctNumber) {
					System.out.println("더 높게");
					minNum = answer;
				} else if (answer > correctNumber) {
					System.out.println("더 낮게");
					maxNum = answer;
				} else {
					break;
				}
				count++;
			}

			// 새 게임 여부 확인하기
			System.out.print("다시 하겠습니까(y/n)>>");
			String answer = scanner.next();
			if ("y".equals(answer) == false) {
				break;
			}
		}

		scanner.close();
	}

}