package October18thLoops;
import java.util.Scanner;

public class dowhileexamplewithwatermoney {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		 int money;
	       int water=5;
	       System.out.println("please pay $5 for water");
	       
	      
	       do
	       {
	    	   money=input.nextInt();  
	    	   if(money>water) {
	        	   System.out.println("This is too much, you need to enter less money");
	        	   }
	        	   else if(money<water)
	        	   {
	            	   System.out.println("Water is expensive, please insert more money");

	        	   }   
	    	 
	       } 
	       while(money!=water);
	       System.out.println("Enjoy your water");

	}

}
