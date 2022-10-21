package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int i = 0;
		for(int j = 0; j < 10; j++) {
			for(int result = 0 + i; result < 10 + i; result++) {
				System.out.print(result + 1 + "	");
			}
			i++;
			System.out.println();
		}
	}
}
