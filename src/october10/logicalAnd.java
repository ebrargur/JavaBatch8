package october10;
import java.util.Scanner;
public class logicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		 
		 System.out.println("enter number");
		 int num=input.nextInt();
		 
		 if(num>0 && num<=10 )
		 {System.out.println("Small number");
	}
		 else if(num>11 && num<=100 )
		 {System.out.println("Medium number");
	}
		 else if(num>100 && num<=1000 )
		 {System.out.println("LArge number");
	}

		
}
}
