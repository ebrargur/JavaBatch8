package october10;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
	
				Scanner input=new Scanner(System.in);
				 
				 System.out.println("enter number");
				 double height=input.nextDouble();
				 
				 if(height<=60 )
				 {System.out.println("Short");
			}
				 else if(height>60 && height<72 )
				 {System.out.println("Medium");
			}
				 else if(height>72 )
				 {System.out.println("Tall");
				 }
				 
				 
				
		}
	}


