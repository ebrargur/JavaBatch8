package October22ndReviewClass;
import java.util.Scanner;

public class operationexample {

	public static void main(String[] args) {

		int num1;
		int num2;
		char operation;
		double result=0;
		boolean cont=true;
		
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter two numbers");

    while(cont) 
    {
		System.out.println("Enter two numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 System.out.println("Please enter the operation");
		 operation=scan.next().charAt(0);
		 String end;
				 switch(operation)
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
						 System.out.println("It is not exist");
				  }
				 System.out.println("The result of the operation is "+ result);
				 System.out.println();
				 System.out.println("Enter yes to perform more operations and No to terminate the program");
	end=scan.next();
	if("No".equals(end))
	{
		//cont=false;break;
		System.out.println("Thanks for using the program");
	}
    }
	}
}
