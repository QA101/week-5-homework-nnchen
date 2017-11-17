
public class FirstHello {

	public static void main(String[] args) {
		System.out.println(firstHalf("HelloThere"));
	}
	
	public static String firstHalf(String myString) {
		int firstHalfEnd = myString.length() / 2;
		String finalResult = myString.substring(0, firstHalfEnd);
		return finalResult;
	}
}

