package com.lab2;

public class NumbersDemo {

public static void displayTwiceTheNumber(int number) {
		
		System.out.println("Twice the number " + number + " is: " + (number * 2));
	
	}
	public static void displayNumberPlusFive(int number) {
        System.out.println("Number " + number + " plus five is: " + (number + 5));
    }

    public static void displayNumberSquared(int number) {
        System.out.println("Number " + number + " squared is: " + (number * number));
    }
		public static void main(String[] args) {
  int a = 5;
  int b=6;
  displayTwiceTheNumber(a);
  displayNumberPlusFive(a);
  displayNumberSquared(a);

 
  displayTwiceTheNumber(b);
  displayNumberPlusFive(b);
  displayNumberSquared(b);
	} 

}


