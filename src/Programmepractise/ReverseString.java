package Programmepractise;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Kamlesh";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			System.out.print(c);
		}

	}

}
