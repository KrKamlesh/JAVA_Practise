package Programmepractise;

public class FindDuplicateusingforloop {
	public static void main(String[] args) {

		String names[] = { "Java", "Selenium", "Selenium", "Java" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println(names[i]);

				}

			}

		}
	}
}
