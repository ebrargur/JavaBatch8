package October11;

import java.util.Scanner;

public class switchandCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("Enter the day"); int day = scan.nextInt(); String today;
		 * switch (day) {//data type is variable must match with data type of cases case
		 * 1: today="Monday"; break; case 2: today="Tuesday"; break; case 3:
		 * today="Wednesday"; break; case 4: today="Thursday"; break; case 5:
		 * today="Friday"; break; case 6: today="Saturday"; break; case 7:
		 * today="Sunday"; break; default: today="Sorry"; } System.out.println(today);
		 */
		String grade;
		String message;

		System.out.println("Enter Your Grade");

		grade = scan.nextLine();

		switch (grade.toUpperCase()) {
		case "A":
			message = "Excellent";
			break;
		case "B":
			message = "Good";
			break;
		case "C":
			message = "Average";
			break;
		case "D":
			message = "Bad";
			break;
		default:
			message = "Not acceptable";
		}
		System.out.println("You entered " + grade + " " + message);

	}

}
