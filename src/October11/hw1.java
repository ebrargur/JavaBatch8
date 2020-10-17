package October11;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input=new Scanner(System.in);
        String country;
		String message;
		
		System.out.println("Enter the Country");
		
        country = input.nextLine();

		switch (country) {
		case "Turkey":
			message = "Turkish";
			break;
		case "Germany":
			message = "German";
			break;
		case "USA":
			message = "English";
			break;
		case "China":
			message = "Chinese";
			break;
		default:
			message = "Not acceptable";
		}
		System.out.println("You entered " + country + " the language is " + message);

	}
	}


