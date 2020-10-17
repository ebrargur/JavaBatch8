package com.syntax.class02;

public class October3rdConditionals {

	public static void main(String[] args) {
		/*
		 * int a=10; int b=15; System.out.println(a>b); System.out.println(a<b);
		 * System.out.println(a==b); System.out.println(a!=b);
		 * 
		 * int a=100; int b=15; System.out.println("Write my first if statement");
		 * if(a<b) { System.out.println("a is bigger than b");}
		 * System.out.println("end it"); int temp=60;
		 * 
		 * if(temp>=60) { System.out.println("I am going to the beach");} else
		 * {System.out.println("Stay home"); }
		 * System.out.println("----------------------------");
		 */
		double first = 7;
		double second = 5.5;

		if (first > second) {
			System.out.println("Double value is "+first+"is larger than "+ second);
		} else {

			System.out.println("Sorry");
		}
		int tempcheck=70;

		if (tempcheck < 32) {
			System.out.println("Water will freeze with temperature ");
		} else {

			System.out.println("Water will NOT freeze with temperature");
		}
 
	}

}
