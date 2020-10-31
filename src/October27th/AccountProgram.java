package October27th;

public class AccountProgram {

	private double balance;
	public void Account()
{
		balance=0.0;
	}
public void deposit(double amount)
{
balance=balance+amount;	

}
public void withdraw(double amount)
{
	balance=balance-amount;	

}
public double getBalance() {
	
	return balance;
}
}
