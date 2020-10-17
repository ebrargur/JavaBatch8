package October11;

import java.util.Scanner;

public class NotOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//! reverse the operator

		/*
		 * boolean b=!true; System.out.println(b);
		 * 
		 * boolean anotherBoolean=!false; System.out.println(anotherBoolean);
		 * System.out.println("...........................");
		 * 
		 * boolean isCold=false; if(!isCold) {
		 * 
		 * System.out.println("I am going to the beach");
		 * 
		 * }
		 */

		/*
		 * boolean isJavaEasy=false; if(!isJavaEasy) { System.out.println("Please try");
		 * 
		 * }
		 * 
		 * 
		 * String day="Monday";
		 * 
		 * if(!(day.equals("sunday") || day.equals("Saturday"))) {
		 * 
		 * 
		 * System.out.println("Work");
		 * 
		 * }
		 */

		// going shopping
		Scanner input = new Scanner(System.in);

		System.out.println("Check the store has sale ");
		boolean sale = input.nextBoolean();
		double price;
		double discount = 0;

		if (!sale) {
			
			System.out.println("No Shopping ");
	
		}
		else {
			System.out.println("What is the price?");
			price = input.nextDouble();

			if (price > 10 || price < 50) {
				discount = (price - (price * .10));
			} else if (price >= 50 || price < 100) {
				discount = (price - (price * .20));
			} else if (price >= 100 || price < 500) {
				discount = (price - (price * .40));
			}

			else if (price > 500) {

				discount = (price - (price * .50));
			}
			System.out.println("The final price is " + discount);
		}

		}

	}


