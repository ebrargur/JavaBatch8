package October22ndReviewClass;

public class TwoDimArrayExamples {

	public static void main(String[] args) {

		System.out.println("Another way--------");

		int[][] myNumbers = { { 10, 20, 30 }, { 1, 2, 3 }, { 100, 200, 300 }

		};

		System.out.println(myNumbers[2][1]);
		System.out.println(myNumbers[0][0]);
		System.out.println("The size of array " + myNumbers.length);
		System.out.println("-----------------------");
		
		for (int i=0; i<myNumbers.length;i++)
		{
			for(int j=0;j<myNumbers[i].length; j++)
			{
				System.out.print(myNumbers[i][j]+" ");

				
			}
			
			System.out.println();

		}

	}

}
