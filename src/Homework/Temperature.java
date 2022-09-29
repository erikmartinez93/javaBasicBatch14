package Homework;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What city are you from?");
		String city=scanner.nextLine();
		System.out.println("Whats the temperature in your city");
		double temp=scanner.nextDouble();
		double celsius=(temp-32)/1.8;
		System.out.println("The temperature in the city is "+ celsius+" celsius");
		

	}

}
