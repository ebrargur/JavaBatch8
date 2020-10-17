package october10;
import java.util.Scanner;

public class logicalOr {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 
		 System.out.println("Enter the Day");
		 int day=input.nextInt();
		 
		 if(day==1 || day==5)
		 {
			 System.out.println("I am off");
		 }
		 else if(day== 2|| day==3)
		 {
			 System.out.println("Git");
		 }
		 else if(day==4)
		 {

			 System.out.println("Review");
		 }
		 else if(day==6| day==7)
		 {
			 System.out.println("java");
		 }
		 else {System.out.println("sorry");}
		}}


