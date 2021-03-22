package JavaBasics;

public class Diamond {

	public static void main(String[] args) {

		int row = 6;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");

			}

			System.out.println();
		}
		for (int m = row; m >= 1; m--) {
			for (int n = row - m; n >= 1; n--) {
				System.out.print(" ");
			}
			for (int v = (m * 2) - 1; v >= 1; v--) {
				System.out.print("*");

			}

			System.out.println();
		}

	}

}
