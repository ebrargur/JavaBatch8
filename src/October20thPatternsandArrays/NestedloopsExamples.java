package October20thPatternsandArrays;

public class NestedloopsExamples {

	public static void main(String[] args) {
	/*	for (int i = 0; i < 3; i++) { 
			  
			 System.out.println("Hello");        
			 
			 for (int j = 2; j < 3; j--) {
                System.out.println("Bye"); }
  
        } 
		
		for (int i = 1; i <=10; i++) { 
			  
			 
			 for (int j =1; j <=4; j++) {
				  
				 System.out.println("i="+i+" and j="+j);  
       } 
    } 
		for (int i = 0; i <=9; i++) { 
			  
			 
			 for (int j =0; j <=9; j++) {
				  
				 System.out.println("i="+i+" and j="+j);  
      } 
   }*/
		for (int h = 0; h <=24; h++) { 
			  
			 
			 for (int m =0; m <60; m++) {
				 if(h<10)
					 {if(m<10)
				  { System.out.println("0"+h+" :0"+m);  
				  }else {
				 System.out.println("0"+h+":"+m);  
     } 
					 else {
						 System.out.println(h+":"+m);  
		     } }
		
	}}


