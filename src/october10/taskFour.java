package october10;
import java.util.Scanner;
public class taskFour {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		/* System.out.println("Enter the Day");
		 
		 int day=input.nextInt();
		 
		 if(day==1 || day<=5)
		 {
			 System.out.println("It is a weekday");
		 }
		 else if(day== 6 || day==7)
		 {
			 System.out.println("It is a weekend");
		 }
		
		 else {System.out.println("Invalid Day");}*/
		
		int quiz,mid,finalScore,avg;
		System.out.println("Enter the quiz");
		quiz=input.nextInt();
		System.out.println("Enter the midterm");
		mid=input.nextInt();
		System.out.println("Enter final");
		finalScore=input.nextInt();
		
		
		 avg=(quiz+mid+finalScore)/3;
		 System.out.println(avg);
		 char grade;
		 if(avg>90)
		 {
			grade='A';

		 }
		 else if(avg>= 70 && avg<90)
		 {
				grade='B';
				
		 }else if(avg>= 50 && avg<70)
		 {
				grade='C';
		 }
		 else if(avg<50)
		 {
				grade='D';
		 }
		 else {grade='F';}
		 System.out.println("Grade is = "+grade);
		 
		 if(grade=='A'|| grade=='B') {
		 System.out.println("You are a good student");
		 }else {		 System.out.println("Please study more");
}
	}
	
	
	

}
