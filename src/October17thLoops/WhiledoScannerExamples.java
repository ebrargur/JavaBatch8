package October17thLoops;

import java.util.Scanner;

public class WhiledoScannerExamples {

	public static void main(String[] args) {

		
		/* Scanner input = new Scanner(System.in);
		 
		 
		 String name = input.nextLine();
		 
		 int num = 1; while (num < 6) { System.out.println("Enter your name");
		 System.out.println("Nice to meet you " + name); num++; }*/
		
		System.out.println("-----------------------");

		Scanner input = new Scanner(System.in);
        
		int luckynumber = 7;
		int randomnum;
		System.out.println("Enter number 1 to 100");
		randomnum = input.nextInt();
		while (luckynumber!=randomnum) {
			
			System.out.println("Enter number 1 to 100");
		
			randomnum = input.nextInt();

			}
		
		}
		 /*
			System.out.println("-----------------------");

			Scanner input = new Scanner(System.in);
int numberfromuser;
			int luckynumber= 7;
			do {
				System.out.println("Enter your lucky number from 1 to 100");
				numberfromuser=input.nextInt();
              }
		
		while(numberfromuser!=luckynumber);
	System.out.println("Great Job");
*/
	}

}
