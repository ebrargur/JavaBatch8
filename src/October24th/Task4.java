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
					}
					System.out.println();
					System.out.println();

				}
		System.out.println("There are  "+countries.length+ " different continents");
		System.out.println("Countries by number of row");
		System.out.println("South America : " + countries[0].length); 
        System.out.println("North America : " + countries[1].length);
        System.out.println("Africa : " + countries[2].length);    
        System.out.println("Asia: " + countries[3].length);
        System.out.println("Europe : " + countries[4].length); 
	}

}
