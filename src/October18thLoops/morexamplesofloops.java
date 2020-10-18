package October18thLoops;
import java.util.Scanner;

public class morexamplesofloops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
int num1=scan.nextInt();
int mul;

     for(int i=1; i<11;i++)
			
		{
		
    	 mul=num1*i;
         System.out.println(num1+"x"+ i +"=" +mul);

    	 
		}
	}

}
