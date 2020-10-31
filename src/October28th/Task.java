package October28th;

public class Task {

	public static void main(String[] args) {

		String username = "ebrar";
		String password = "12333333333";

		System.out.println();
		if ((username.isEmpty()) || (password.isEmpty())) {

			System.out.println("Username and Password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password should be minimum 8 characters");
		} else if (password.contains(username)) {
			System.out.println("Password cannot contain username");
		} else if (!password.equals(password)) {
			System.out.println("Passwords do not match");

		} else {
			System.out.println("Your username and password has been created");
		}

	}

}
