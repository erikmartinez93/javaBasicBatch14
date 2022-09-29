package Homework;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);  
		System.out.println("Please enter your grade");
		char grade=scanner.next().charAt(0);
		String result = null;
		
		switch(grade) {
		
		case'A':
			result="Excellent";
			break;
		case'B':
			result="Good";
			break;
		case'C':
			result="Average";
			break;
		case'D':
			result="Bad";
			break;
			default:
				result="Not acceptable";
		}
		System.out.println("Your grade is "+grade+" and it is "+result);

	}

}
