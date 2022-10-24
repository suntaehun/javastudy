package prob04;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		char[] result = new char[cs.length];
		int j = 0;
		for (int i = cs.length - 1; i >= 0; i--) {

			result[j] = cs[i];
			j++;
		}

		return result;
	}

	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}