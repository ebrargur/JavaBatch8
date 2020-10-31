package October21th;

import java.util.Scanner;

public class ArrayfromScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names;
		System.out.println("Enter the length of the array:");
		int size = scan.nextInt();

		names = new String[size];

		// System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the names");
			names[i] = scan.next();

		}
		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i] + " ");
		}

	}

}
