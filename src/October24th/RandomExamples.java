package October24th;
public class RandomExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {0,10,20,8,-1,77,56};

		for(int i=num.length-1; i>=0; i--)
		{
			
			System.out.print(num[i]+" ");
		}
 //we cant loop backward using enhanced for loop.
		//it starts from beginning of the loop and stops at the end.
	}

}
