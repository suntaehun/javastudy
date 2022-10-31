package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Character c1 = new Character('c');
		Boolean b1 = new Boolean(true);
		
//		Auto Boxing
		Integer i2 = 10;
		Long l = 10L;
		
		System.out.println(i2.equals(10));	// Auto Boxing
		System.out.println(i2.equals(new Integer(10)));
		
		// Auto Unboxing
		System.out.println(i2 == 10);
		System.out.println(i2.intValue() == 10);

		int m = i2 + 10;
//		int m = i2.intValue() + 10;

	}

}
