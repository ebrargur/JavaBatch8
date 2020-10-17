package com.syntax.class01;

public class arithmeticNumbers {
	public static void main(String[] args) {
		
		int x = 5;
	    int y = 6;
	    System.out.println(x + y);
	    System.out.println(x - y);
	    System.out.println(x * y);
	    System.out.println(x / y);

		double num1=10.3;
		double num2=30.5;
		double mult=num1*num2;
	    double div=num1/num2;
	    double sub=num1-num2;
	    double add=num1+num2;
	    System.out.println("The adding of 2 numbers " + num1 + " and " + num2 +" is equal to " + add);
	    System.out.println("The subs of 2 numbers " + num1 + " and " + num2 +" is equal to " + sub);
	    System.out.println("The mult of 2 numbers " + num1 + " and " + num2 +" is equal to " + mult);
	    System.out.println("The div of 2 numbers " + num1 + " and " + num2 +" is equal to " + div);


		//Task 2
	    
	    
	    double var1=3.9;
	    double var2=var1*var1;
	    System.out.println("The square of the " +var1+" is "+ var2);
	    
	    //Task3
	    
	    int side1=2;
	    int side2=4;
	    int area=side1*side2;
	    int perimeter=side1+side1+side2+side2;
	    System.out.println("The perimeter of a rectangle with width"+ side1 +" and height " + side2 + "is equal to" +perimeter+ " and the area is "+ area);
	    
	    
	    
	    
	    /*float num3=10.3f;
		float num4=30.5f;
		float mult1=num3*num4;
		System.out.println(mult1);
		float div1=num3/num4;
	    System.out.println(div1);
	    float sub1=num3-num4;
	    System.out.println(sub1);
	    float add1=num3+num4;
	    System.out.println(add1);
	    */
	    
	}
	
}
