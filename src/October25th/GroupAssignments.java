package October25th;
import java.util.Arrays;

public class GroupAssignments {

	public static void main(String[] args) {
		// Write a program to sawp 2 numbers without a temporary variable
		
		/*int x=10;
		int y=20;
		System.out.println("Numbers");
		x=y+x;
		y=x-y;
		x=x-y;
		
		System.out.println("The new values of x and y "+x+" "+y);

		//Write a java program to check whether a given number is prime or not?

		int num=7;
		int m=0;
		m=num/2;
		
		if(m==1)
			
		{
			System.out.println("Prime number");}
			
		else {			System.out.println("Not Prime number");}

		
	//Write a Java Program to print the first 10 numbers of Fibonacci series.
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=10; i++)
		{
			
			//System.out.print(a);
			c=a+b;
			System.out.print(c+" ");

			a=b;
			b=c;
			
		}
		
//Maximum and minimum number in the array?
		int[] array= {0,10,20,8,-1,77,56};
		int max = array[0];
		int size=array.length;
		int min=array[size-1];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
				
			}
			else if(array[i]<min) {
				
				min=array[i];
			}
		}
			
			System.out.println("The Largest Number is:" + max);
			System.out.println("The Smalles Number is:" + min);
Arrays.sort(array);
System.out.println("The Largest Number is:" + array[0]);
			System.out.println("The Smalles Number is:" + array[length-2]);


//Write a java program to find the second largest number in the array?
		int[] num1 = {1,5,3,6};
		int length=num1.length;
		Arrays.sort(num1);//sort to array 1,3,5,6 -1 will give 6 -2 give -2
		System.out.println("Second highest number is "+num1[length-2]);
		//Write a java program to find the second largest number in the array?


int[] array = {1067, 90, 450, -34, 450, 1, 199};
		int max = array[0];
		int secondMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {
				
				secondMax = array[i];
			}
		}
		System.out.println(secondMax);
//Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.

		 int[][] myNumbers = { {1, 2, 3}, {5, 6, 7},{8, 9, 7} };
		  int sum = 0;  
		    for (int i = 0; i < myNumbers.length; i++) {
		    	
		      for(int j = 0; j < myNumbers[i].length; j++)
		      
		      {
		    	
		        sum=sum+myNumbers[i][j];
		        
		      }
		     
	} System.out.println(sum);
//Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

	int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7,8},{8, 9, 7,8} };
	
	    for (int i = 0; i < myNumbers2.length; i++) {
	    	
	      for(int j = 0; j < myNumbers2[i].length; j++)
	      
	      {
	    	if(myNumbers2[i][j] % 2==0)
	    	{
	    		System.out.print(myNumbers2[i][j]+" ");
	    		
	    		
	    	}
	  
	      }
	     
} */
		
//Create a 2D array to store numbers and calculate sum of all odd numbers.
		int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7,8},{8, 9, 7,8} };
		int sum=0;
	    for (int i = 0; i < myNumbers3.length; i++) {
	    	
	      for(int j = 0; j < myNumbers3[i].length; j++)
	      
	      {
	    	if(myNumbers3[i][j] % 2 !=0)
	    	{
	    		
	    		
	    	sum=sum+myNumbers3[i][j];
	    	
	    	
	    /*System.out.print(myNumbers3[i][j]+" ");*/
	    		
	    		
	    	}
	  
	      }
	      
	}
	    System.out.println(sum);

	}
}

