package Homework;

import java.util.Scanner;

public class Calculator {

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
		
		if (operator.equals("+")){
			result= number1 + number2;
		}else if (operator.equals("-")) {
			result= number1 - number2;
		}else if (operator.equals("*")) {
			result= number1 * number2;
		}else if (operator.equals("/")) {
			result= number1 / number2;
		}
		System.out.println(" Result of "+number1+" "+operator+" "+number2+" is "+result+"");   

	}

}
