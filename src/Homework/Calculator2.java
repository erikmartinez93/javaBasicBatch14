package Homework;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		System.out.println("First number:");
		double number1=scanner.nextDouble();
		
		System.out.println("Second number:");
		double number2=scanner.nextDouble();
		
		System.out.println("Please enter the desired operator +,-,*,/");
		String operator=scanner.next();
		double result=0.0;
		
		switch (operator) {
		
		case"+":
			result= number1 + number2;
			break;
		case"-":
			result= number1 - number2;
			break;
		case"*":
			result= number1 * number2;
			break;
		case"/":
			result= number1 / number2;
			break;
		}
		System.out.println(" Result of "+number1+" "+operator+" "+number2+" is "+result+""); 

	}

}
