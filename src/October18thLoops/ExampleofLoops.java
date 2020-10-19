package October18thLoops;
import java.util.Scanner;

public class ExampleofLoops {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       System.out.println("please pay $5 for water");
       
       int money=input.nextInt();
       int water=5;
       
       while(money!=water)
       { 
    	   if(money>water) {
    	   System.out.println("This is too much, you need to enter less money");
        //   money=input.nextInt();  	  
    	   }
    	   else
    	   {
        	   System.out.println("Water is expensive, please insert more money");
              // money=input.nextInt();  	   }

    	   }        //   money=input.nextInt();  	   

       }    	   
       System.out.println("Enjoy your water");

	}

}
