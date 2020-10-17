package october10;

import java.util.Scanner;

public class October10th {

	public static void main(String[] args) {

		/*
		 * Scanner input=new Scanner(System.in); System.out.println("Enter your name");
		 * String sentence=input.nextLine();
		 * System.out.println("your word is "+sentence);
		 * 
		 * System.out.println("Enter your number"); int number=input.nextInt();
		 * System.out.println("Your number is "+number);
		 * 
		 * System.out.println("Enter a single character"); char
		 * word=input.next().charAt(0);
		 * 
		 * System.out.println("Your character is "+word);
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have credit or not");
		double balance;
		boolean answer = scan.nextBoolean();

		if (answer) {
			System.out.println("What is the balance on the card?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay your balance");
			} else {
				System.out.println("You cant spend more");
			}

		} else {
			System.out.println("would u like to get one");
		}

	}

}
