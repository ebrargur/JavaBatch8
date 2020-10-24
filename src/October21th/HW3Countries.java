package October21th;


public class HW3Countries {

	public static void main(String[] args) {
		String[] countries = {"Turkey", "USA", "Canada"};
		
		
		
		countries[0]="Ankara";
		countries[1]="Washington";
		countries[2]="Toronto";
				
		for(int i=0;i<countries.length;i++)
			{
				
			//	System.out.println(countries[i]+" ");
				System.out.println("The capital of index "+ (i)+":"+countries[i]+" ");
			
			}
		// System.out.println(Arrays.todeepString(countries));
		 
		for(String capital:countries)
		{
			System.out.print(capital +" ");

		
}
		
	}}
