package prob5;

public class Prob5 {

	public static void main(String[] args) {

		for (int i = 1; i < 37; i++) {
			String number = String.valueOf(i);
			int count = 0;

			for (int j = 0; j < number.length(); j++) {
				char c = number.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					count++;
					
					System.out.print(number + "	");
					for(int k = 0; k < count; k++) {
						System.out.print("짝");
					}
					System.out.println();
					
					break;
				}

			}

		}

	}
}
