package October27th;

import java.util.Scanner;

public class Account {
	String accountId;
	String userName;
	String password;
	double balance;
	String typeOfAccount;
	double limit;

	boolean login(String enteredUserName, String enteredpassword) {
		if (userName.equals(enteredUserName) && password.equals(enteredpassword)) {
			return true;

		} else {
			return false;
		}
	}

	Scanner input = new Scanner(System.in);

	void transfer() {
		System.out.println("Please enter the amount");
		int amount = input.nextInt();

		if (amount < balance) {
			System.out.println("The new balance of your account " + (balance - amount));
		}
		else {			System.out.println("You dont have enough balance to transfer money");
}

	}

}
