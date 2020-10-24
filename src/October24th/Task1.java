package October24th;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
*/
		String[][] titles = { { "Mr.","Mrs.","Ms","Miss" }, { "Smith","Jordan","Jackson","Obama"}};

	
		System.out.println(titles[0][1]+" "+titles[1][0]+", ");
		System.out.println(titles[0][0]+" "+titles[1][3]+", ");
		System.out.println(titles[0][2]+" "+titles[1][2]+", ");
		System.out.println(titles[0][3]+" "+titles[1][1]);
		
		
	}

}
