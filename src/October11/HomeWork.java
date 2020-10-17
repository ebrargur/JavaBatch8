package October11;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				/*			System.out.println("Enter the sale amount");
			double samount=input.nextDouble();
				double famount;
				if(samount>10 && samount<100)
				{
					
					famount=(samount*10)/100;
					
				}
				else if(samount>=100 && samount<200)
				{
					
					famount=(samount*20)/100;
					
				}
				
				else if(samount>=200 && samount<500)
				{
					
					famount=(samount*30)/100;

					
				}
				else if(samount>=500)
				{
					
					famount=(samount*50)/100;
					
				}
				else {famount=0;}
				
				 System.out.println("Commission "+famount);
				 
				//Write a program to find largest number among three numbers using nested if
					// provided by a user (numbers must be distinct) 
				 System.out.println("Enter the first");
				*/
int number1=input.nextInt();
int number2=input.nextInt();
int number3=input.nextInt();
int largestnum;
if(!(number1 == number2 && number2 == number3)) 
{
if (number1>number2 && number1>number3)
{
	largestnum=number1;

}
else if(number2>number1 && number2>number3)
{	largestnum=number2;
}
else {		largestnum=number3;

}
System.out.println(largestnum);
	}
else {System.out.println("Numbers are equal");}
	}
}
