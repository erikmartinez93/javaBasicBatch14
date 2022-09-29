package Homework;

import java.util.Scanner;

public class MortgageRate {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in); 
		
		System.out.println("Whats the mortgage rate?");
		
		double rate = scanner.nextDouble ();
		
		if (rate>4.5) {
			System.out.println("You are not eligible to buy a house");
		}else {
			System.out.println("Congratulations you are approved");
		}
		System.out.println("What is the price of the house");
		
		int priceOfHouse=scanner.nextInt();
		if (priceOfHouse>3000000) {
			System.out.println("I will take a loan");
		}else {
			System.out.println("I will agree to pay cash");
		}

	}

}
