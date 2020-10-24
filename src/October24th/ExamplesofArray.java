package October24th;

public class ExamplesofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] array= {0,10,20,8,-1,77,56};
int max = array[0];
for(int i=0;i<array.length;i++)
{
	if(array[i]>max)
	{
		max=array[i];
		
	}
}
	
	System.out.println("The Largest Number is:" + max);

	}

}}
