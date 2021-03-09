package Programmepractise;

public class ReverseIntegerUsingStringBuffer {
	public static void main(String[] args) {
		long num = 985985858;

		StringBuffer sf = new StringBuffer(String.valueOf(num)).reverse();
		System.out.println(sf);

	}

}
