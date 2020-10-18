package October17thLoops;

public class Exampleofloops {

	public static void main(String[] args) {
	/*	String day = "Saturday";
		if (day.equals("Saturday")) {

			System.out.println("My favorite class");
		}
	//	while (day.equals("Saturday"))	{
//System.out.println("My favorite class");
		//}
boolean isbreak=true;
if(isbreak) {
	System.out.println("tea");

}
while(isbreak) {
	System.out.println("tea");
isbreak=false;
}*/
		boolean workday=true;
		int day=1;
		while(workday)
		{
			
			
			if(day<6)
			{
				System.out.println("I need a day off");
			}
			
			else{System.out.println("I dont need a day off");
			workday=false;
			
			
			}

			day++;
		}
		
	}

}
