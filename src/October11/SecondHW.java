package October11;
import java.util.Scanner;

public class SecondHW {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	
		System.out.println("Please enter the first number");
		int num1=scan.nextInt();
		System.out.println("Please enter the second number");
		int num2=scan.nextInt();
		System.out.println("Please enter the operator sign");
		
		char sign=scan.next().charAt(0);
		
		int result=0;
		
		switch(sign)
		{
		
		case '+':
		result=num1+num2;
		break;
		
		case '-':
		result=num1-num2;
		break;
		
		case '*':
		 result=num1*num2;
		 break;
		 
		case '/':
		result=num1/num2;
		break;
		default:
		System.out.println("Invalid Result");
		}
		System.out.println("The result of the operation is " + result);
	}

}
