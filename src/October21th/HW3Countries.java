package October21th;

public class HW3Countries {

	public static void main(String[] args) {
		String[] countries = { "Turkey", "USA", "Canada" };
        String[] capitals= {"Ankara","Washington","Ottawa"};

	/*	for (int i = 0; i < countries.length; i++) {

			System.out.println("The capital of index " + (i) + ":" + countries[i] + " ");

		}*/
		String capital;
		for (String country : countries) {
			switch (country) {
			case "Turkey":

				capital = "Ankara";
				break;
			case "USA":
				capital = "Washington";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			default:

				capital = "I dont know";

			}
			
			System.out.println("The capital of " + country + ":" +capital);
		}

	}
}
