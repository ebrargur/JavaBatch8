package October24th;

public class Task3 {

	public static void main(String[] args) {
		//create 2D array of food
//First array 
		//american
		//italian
		//asian
		//afghani
		//indian
		
		String[][] food= {
				{"Steak","Hot Dog","Cheeseburger"},
				{"Pzza","pasta","canoli"},
				{"Sushi","ramen","fried rice","dumplings"},
				{"kebab","manto"},
				{"Beriyani","masal","rice"}
				
		};
				

				for(String[] foodArray:food)
				{
					
					for(String dishes:foodArray)
					{
						
						System.out.print(dishes+"   ");

						
					}
					System.out.println();
					System.out.println();

				}
				System.out.println("Regular Loop---------------");

				for(int i=0;i<food.length; i++)
				{
					
					for(int j=0;j<food[i].length;j++) {
						
						System.out.print(food[i][j]+" ");
					}
					System.out.println();
					System.out.println();
				}
		}
		
		
	}


