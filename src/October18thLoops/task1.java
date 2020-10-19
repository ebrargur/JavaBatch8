package October18thLoops;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start number");
int start=scan.nextInt();
System.out.println("Please enter end number");
int end=scan.nextInt();

int even=0;
int odd=0;

     for(int i=start; i<=end;i++)
			
		{
		
    if(i%2==0)
    {
    	
    	even=even+i;
    }
    else {
    	odd=odd+i;
    }
    
		
   
		}
     System.out.println(even);
     System.out.println(odd);
	}
		
	}


