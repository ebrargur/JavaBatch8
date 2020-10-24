package October24th;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian. And print all values from a 2D array

		String[][] cars = { { "American","German","Korean","Italian" }, { "ford","lincoln","chevrolet","tesla"},{ "audi","porsche","audi","mercedez"},
				{ "hyundai","kia","renault","Gm" },	{ "fiat","alfa","lamborghi","Gm" }	};

		
		for (int i = 0; i<cars.length; i++) {
			for (int j = 0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j] + "|           |");
			}
			System.out.println();

			}
		
		System.out.println("-------------------------------");

		for(String[] carArray:cars)
		{
			
			for(String car:carArray)
			{
				
				System.out.println(car+" ");

				
			}
			System.out.println();

		}
	}

}
