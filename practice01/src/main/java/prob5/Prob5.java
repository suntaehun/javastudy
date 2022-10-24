package prob5;

public class Prob5 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			String number = String.valueOf(i);
			int count = 0;

			for (int j = 0; j < number.length(); j++) {
				char c = number.charAt(j);
				if (c == '3' || c == '6' || c == '9') {

					count++;

				}

			}

			if (count == 1) {
				System.out.print(number + "	");
				System.out.println("짝");
			} else if (count == 2) {
				System.out.print(number + "	");
				System.out.println("짝짝");

			}

		}

	}
}
