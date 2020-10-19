package October18thLoops;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String item;
		int amount;
		int price;
		//int total = 10;
		
	
		
	//while(total!=price) 
		do {
			
			System.out.println("Please enter item");
			item = scan.nextLine();
			
			System.out.println("Please enter price of the item ");

			amount = scan.nextInt();
			
			System.out.println("Please enter your money");

			price = scan.nextInt();
			
			if (amount < price) {
				System.out.println("Here is your change " + (price-amount));
		        break;
			}
			else if(amount>price)
			{
				System.out.println("You need to pay " + (amount - price));
                  break;
				
			}
			
	
		}while(amount!=price);
				System.out.println("Thanks for shopping");

			
	
	}
}