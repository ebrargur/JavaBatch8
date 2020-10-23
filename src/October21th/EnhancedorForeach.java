package October21th;

public class EnhancedorForeach {

	public static void main(String[] args) {

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda","Lexus","Toyota"};
	/*	for(int i=0;i<cars.length;i++)
		{
			
			System.out.println(cars[i]);
		}*/
		for(String car:cars)
		{
			System.out.print(car +" ");

		}
		int[] numbers= {10,10,90,40,89};
		for(int num:numbers)
		{
			System.out.print(num +" ");

		}
		boolean[] boo= {true,false,true,false};
		for(boolean num:boo)
		{
			System.out.print(num +" ");

		}
		
		
		
		
		
	}

}
