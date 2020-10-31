package October27th;

public class SmartPhone {


	    String brand;
	    String size;
	    String color;
	    String type;
	    String company;
	    String text;


	    void call()
	    {
	        System.out.println("Calling");
	    }
	    void game()
	    {
	        System.out.println("Can play games");
	    }
	 
	 
	    public static void main(String[] args) {
			
			SmartPhone x1=new SmartPhone();

	        x1.brand="IPhone11";
	        x1.size="Small";
	        x1.color="white";
	        x1.type="Iphone";
	        x1.company="Apple";

	        x1.call();
	        x1.game();
	       
		}
	 
	}

	


