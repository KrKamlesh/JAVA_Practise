package Programmepractise;

import java.util.Arrays;

public class SortingThevalue {

	public static void main(String[] args) {

		int num[] = { 2, 5, 8, 1, 6, 12 };
		System.out.println("The value of array before sorting: " + Arrays.toString(num));
		// The number of time Compare the value is n-1
		int size = num.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					
				}
				
			}
			
			
		}
		System.out.println("The value  of array after sorting" + Arrays.toString(num));
	}

}
