package prob04;

public class StringUtil {
	private static String result ="";

	public static String concatenate(String[] str) {

		for (int i = 0; i < str.length; i++) {
			result += str[i];
		}
		return result;
	}
}
