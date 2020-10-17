import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
  	Scanner input = new Scanner(System.in);
  	System.out.println("Welcome to Syntax,Please enter your username");
    String name=input.nextLine();
    System.out.println("Welcome to Syntax,Please enter your password");
    String pass=input.nextLine();
  
    System.out.println("Enter your account how much money you want to transfer");
   double amountTransfer=input.nextDouble();

   //double accountBalance=100.00;

if((pass=="pass123") && (name=="Ebrar"))
{
System.out.println("Welcome to Ebrar ");
{
}
}else if((pass=="pass123") && (name!="Ebrar"))
{
System.out.println("Enter your name again");

}
else if((pass!="pass123") && (name=="Ebrar"))
{
System.out.println("Enter your password again");

}
else{
System.out.println("Invalid Credentials,Please try again later!");

}
  }
}