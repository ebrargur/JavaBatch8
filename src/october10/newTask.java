package october10;
import java.util.Scanner;

public class newTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the month");
		
      String month=input.nextLine();
      if(month.equals("December") || month.equals("January") || month.equals("Fabruary"))
     
      {System.out.println("Winter");}
     //season="Winter";
      else if(month.equals("March") || month.equals("April") || month.equals("May"))
     
      {System.out.println("Spring");}
      //season="Spring";
      else if(month.equals("June") || month.equals("July") || month.equals("August"))
     
      {System.out.println("Summer");}
    //season="Summer";
      else if(month.equals("September") || month.equals("October") || month.equals("November"))
      
      {System.out.println("Fall");}
      
      //season="Fall";
	}
System.out.println("You were born in"+season);
}
