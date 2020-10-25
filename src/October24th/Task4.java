package October24th;

public class Task4 {

	public static void main(String[] args) {
		// Countries by continent

		String[][] countries= {
				{"Argentina","Brazil","USA"},
				{"Cuba","Mexico","Jamaica"},
				{"Algeria","Benin","Chad","congo"},
				{"Afghanistan","India","PAkistan"},
				{"Albania","Cyprus","Germany"}
				
		};
				int sum=0;

				for(String[] CountryArray:countries)
				{
					
					for(String count:CountryArray)
					{
						
						System.out.print(count+"   ");

						
					}		

					System.out.println();
					System.out.println();

				}		

				System.out.println("Regular Loop---------------");
		for(int i=0;i<countries.length; i++)
				{
					
					for(int j=0;j<countries[i].length;j++) {
						
						System.out.print(countries[i][j]+" ");
						
					}sum=sum+countries[i].length;
					System.out.println();
					System.out.println();

				}
		System.out.println("There are "+sum+" countries");
		
	
	}

}
